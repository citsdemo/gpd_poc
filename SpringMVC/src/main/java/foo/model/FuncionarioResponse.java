package foo.model;

import java.io.Serializable;
import java.math.BigDecimal;


public class FuncionarioResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8402582656006803283L;

	private Long id;

	private String firstname;

	private String lastname;

	private String nickname;

	private BigDecimal salary;
	
	

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
