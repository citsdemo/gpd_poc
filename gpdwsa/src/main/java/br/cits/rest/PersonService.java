package br.cits.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import foo.dao.PersonDao;
import foo.model.Person;

@Component
@RequestMapping("/rest/pessoa")
public class PersonService  {

	@Autowired	
	private PersonDao personDao;
		
	@RequestMapping(method=RequestMethod.GET,value="list")	
	public @ResponseBody List<PessoaResponse> listarPessoa(){
		
		List<Person> persons = personDao.getPeople();
		List<PessoaResponse> pessoas = new ArrayList<PessoaResponse>();
		PessoaResponse pessoa ;
		for (Person person : persons) {
			
			pessoa = new PessoaResponse();
			pessoa.setFirstName(person.getFirstName());
			pessoa.setId(person.getId());
			pessoa.setLastName(person.getLastName());
			pessoas.add(pessoa) ;
		}
		
		return pessoas;
	}
}
