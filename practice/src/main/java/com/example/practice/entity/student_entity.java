package com.example.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student_entity {

	private String name;
	@Id
	private Long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
