package com.kodnest.hibernate_Project4_ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int technlogy_Id;
	String technology_Name;
	
	@ManyToMany
	List<Employee> employee;
	
	//zero parameterized constructor
	public Technology() {
	}
	//parameterized constructor
	public Technology(int technlogy_Id, String technology_Name, List<Employee> employee) {
		this.technlogy_Id = technlogy_Id;
		this.technology_Name = technology_Name;
		this.employee = employee;
	}
	
	//getters and setters
	public int getTechnlogy_Id() {
		return technlogy_Id;
	}

	public void setTechnlogy_Id(int technlogy_Id) {
		this.technlogy_Id = technlogy_Id;
	}

	public String getTechnology_Name() {
		return technology_Name;
	}

	public void setTechnology_Name(String technology_Name) {
		this.technology_Name = technology_Name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}	
}
