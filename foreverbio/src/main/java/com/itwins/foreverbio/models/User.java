package com.itwins.foreverbio.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	private int id;
	private String email;
	private String firstname;
	private String lastname;
	private int age;
	private String password;
	
	
	
	
	
	public User(String email, String firstname, String lastname, int age, String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
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
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
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
		return "User [id=" + id + ", email=" + email + ", firstName=" + firstname + ", lastName=" + lastname + ", age="
				+ age + ", password=" + password + "]";
	}
	
	
	
	
}
