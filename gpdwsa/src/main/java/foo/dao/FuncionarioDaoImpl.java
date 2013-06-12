package foo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import foo.model.Funcionario;

@Repository
public class FuncionarioDaoImpl implements FuncionarioDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Funcionario save(Funcionario funcionario) {
		if (funcionario.getId() == null) {
			entityManager.persist(funcionario);
			return funcionario;
		} else {
			return entityManager.merge(funcionario);
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Funcionario> listar() {
		return entityManager.createQuery("select f from Funcionario f").getResultList();
	}

	@Override
	public Funcionario getById(Long id) {
		return entityManager.find(Funcionario.class, id);		
	}

	@Override
	public void remover(Long id) {	
		entityManager.detach(entityManager.find(Funcionario.class, id));
	}
	

}
