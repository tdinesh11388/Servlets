package com.Register;

public class Student
{
	private int id;
	private String name;
	private String email;
	private String id_card_number;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId_card_number() {
		return id_card_number;
	}
	public void setId_card_number(String id_card_number) {
		this.id_card_number = id_card_number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", id_card_number=" + id_card_number + "]";
	}
	
	
}
