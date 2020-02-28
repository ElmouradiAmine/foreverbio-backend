package com.itwins.foreverbio.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private int age;
	private String password;
	
	
	
	
	
	public User(String email, String firstName, String lastName, int age, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", password=" + password + "]";
	}
	
	
	
	
}
