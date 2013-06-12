package br.cits.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.cits.rest.response.FuncionarioRequest;
import br.cits.rest.response.FuncionarioResponse;
import foo.dao.FuncionarioDao;
import foo.model.Funcionario;

@Component
@RequestMapping("/rest/funcionario")
public class FuncionarioService {
	
	@Autowired
	FuncionarioDao funcionarioDao;
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="list")	
	public @ResponseBody List<FuncionarioResponse> listar(){
		
		List<Funcionario> funcionarios = funcionarioDao.listar();
		List<FuncionarioResponse> funcionariosResp = new ArrayList<FuncionarioResponse>();
		for (Funcionario funcionario : funcionarios) {
			
			funcionariosResp.add(new FuncionarioResponse(funcionario));
			
		}
		
		return funcionariosResp;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="{id}")	
	public @ResponseBody FuncionarioResponse getById(@PathVariable long id){
		
		Funcionario func = funcionarioDao.getById(id);
		if(func != null){
			
			return new FuncionarioResponse(func);
		}
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody	
	public FuncionarioResponse cadastrar(@RequestBody FuncionarioRequest funcionarioReq){
		Funcionario funcionario = new Funcionario();
		funcionario.setId(funcionarioReq.getId());
		funcionario.setFirstname(funcionarioReq.getLastName());
		funcionario.setNickname(funcionarioReq.getNickName());
		funcionario.setLastname(funcionarioReq.getLastName());
		funcionario.setSalary(new BigDecimal(funcionarioReq.getSalary()));
		
		funcionario = funcionarioDao.save(funcionario);
		
		return new FuncionarioResponse(funcionario);
		
	}
	
	

}
