package com.labs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Email_Addresses")
public class EmailAddress {

	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="id_person")
	private Person person;
	private String email;
	
	public EmailAddress() {
		
	}
	public EmailAddress(Integer id, Person person, String email) {
		this.id = id;
		this.person = person;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
