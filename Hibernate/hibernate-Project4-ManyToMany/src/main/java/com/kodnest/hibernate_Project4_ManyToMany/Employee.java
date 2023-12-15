package com.kodnest.hibernate_Project4_ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	int  employee_id;
	String  employee_name;
	String  employee_team;
	
	@ManyToMany
	List<Technology> tech;
	
	public Employee() {
	}

	public Employee(int employee_id, String employee_name, String employee_team, List<Technology> tech) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_team = employee_team;
		this.tech = tech;
	}
	 

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_team() {
		return employee_team;
	}

	public void setEmployee_team(String employee_team) {
		this.employee_team = employee_team;
	}

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}
	
}
