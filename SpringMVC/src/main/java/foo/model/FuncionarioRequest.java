package foo.model;

import java.io.Serializable;


public class FuncionarioRequest implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1206868572562977108L;

	private Long id;

	private String firstName;

	private String lastName;

	private String nickName;

	private String salary;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	

	

}
