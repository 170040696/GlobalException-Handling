package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tourist {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String coty;
	private String packageType;
	private double budget;
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tourist(Integer id, String name, String coty, String packageType, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.coty = coty;
		this.packageType = packageType;
		this.budget = budget;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoty() {
		return coty;
	}
	public void setCoty(String coty) {
		this.coty = coty;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
}
