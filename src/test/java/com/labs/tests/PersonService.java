package com.labs.tests;

import java.util.List;

import javax.persistence.EntityManager;

import com.labs.model.Person;

public class PersonService {

	public EntityManager em;
    
    public PersonService(EntityManager em) {
       	this.em = em;
    }
    
    public void generateData() {
 
        create(1, "Ravi", "Raj");
        create(2, "Amit", "Raj");
        create(3, "Nitish", "Kumar");

    }
 
    private void create(int id, String name, String city) {
        em.getTransaction().begin();
        Person p = new Person(id, name, city);
        em.persist(p);
        em.getTransaction().commit();
    }
    
	@SuppressWarnings("unchecked")
	public List<Person> listAll(){
    	return em.createQuery("Select t from Person t").getResultList();
    }


}
