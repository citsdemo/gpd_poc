package foo.dao;

import java.util.List;

import foo.model.Funcionario;

public interface FuncionarioDao {
	
	Funcionario save(Funcionario funcionario) ; 
	List<Funcionario> listar ();
	Funcionario getById(Long id);
	void remover(Long id);

}
