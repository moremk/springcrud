package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="demo")
@Entity
public class EntityData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private int id;
	private String name;
	private  String degree;
	
	public EntityData()
	{
		
	}
	
	public EntityData(int id, String name, String degree) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
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
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "entity [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}

	

}
