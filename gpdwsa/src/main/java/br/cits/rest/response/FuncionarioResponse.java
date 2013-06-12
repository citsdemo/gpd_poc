package br.cits.rest.response;

import java.math.BigDecimal;

import foo.model.Funcionario;


public class FuncionarioResponse {
	
	private Long id;

	private String firstname;

	private String lastname;

	private String nickname;

	private BigDecimal salary;
	
	
	public FuncionarioResponse(Funcionario funcionario){
		
		this.firstname = funcionario.getFirstname();
		this.id = funcionario.getId();
		this.nickname = funcionario.getNickname();
		this.salary = funcionario.getSalary();
		this.lastname = funcionario.getLastname();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	

}
