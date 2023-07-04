package com.creation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String departmenty;
	
	private String salary;
	
	private String email;
	
	private String password;

	public Emp(String name, String departmenty, String salary, String email, String password) {
		super();
		this.name = name;
		this.departmenty = departmenty;
		this.salary = salary;
		this.email = email;
		this.password = password;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmenty() {
		return departmenty;
	}

	public void setDepartmenty(String departmenty) {
		this.departmenty = departmenty;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", departmenty=" + departmenty + ", salary=" + salary + ", email="
				+ email + ", password=" + password + "]";
	}
	
	
}
