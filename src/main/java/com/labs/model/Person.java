package com.labs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
public class Person {

	@Id
	private Integer id;
	private String name;
	private String city;
	
	@OneToMany(mappedBy = "person", targetEntity = EmailAddress.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<EmailAddress> emailAddresses;

	public Person() {
		
	}
	public Person(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<EmailAddress> getEmailAddresses() {
		return emailAddresses;
	}
	public void setEmailAddresses(List<EmailAddress> emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
}
