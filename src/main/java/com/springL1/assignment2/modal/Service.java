package com.springL1.assignment2.modal;

public class Service {

	private int id;

	private String name;

	private String Description;

	public Service(int id, String name, String description) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.Description = description;
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

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
