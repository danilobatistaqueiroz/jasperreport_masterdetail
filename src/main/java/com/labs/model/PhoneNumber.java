package com.labs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Phone_Numbers")
public class PhoneNumber {

	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="id_person")
	private Person person;
	private String phone;
	
	public PhoneNumber() {
		
	}
	public PhoneNumber(Integer id, Person person, String phone) {
		this.id = id;
		this.person = person;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
