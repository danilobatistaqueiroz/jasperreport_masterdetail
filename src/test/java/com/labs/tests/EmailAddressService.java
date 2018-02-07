package com.labs.tests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.labs.model.EmailAddress;
import com.labs.model.Person;

@SuppressWarnings("unchecked")
public class EmailAddressService {
    
	private EntityManager em;
	
    public EmailAddressService(EntityManager em) {
    	this.em = em;
    }
    
    public void generateData(Person person1, Person person2, Person person3) {
 
        create(1, person1, "willy@gmail.com");
        create(2, person1, "raj@gmail.com");
        create(3, person1, "kumar@gmail.com");
        
        create(4, person2, "raj@gmail.com");
        create(5, person2, "caleb@gmail.com");
        
        create(6, person3, "joshua@gmail.com");
    }
 
    private void create(Integer id, Person person, String email) {
        EmailAddress emailAddress = new EmailAddress(id, person, email);
        List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
        emailAddresses.add(emailAddress);
        person.setEmailAddresses(emailAddresses);
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
    }
    
	public List<EmailAddress> listAll(){
    	return em.createQuery("Select t from EmailAddress t").getResultList();
    }
	
	public List<EmailAddress> listByPerson(Integer idPerson){
    	return em.createQuery("Select t from EmailAddress t where idPerson = :idPerson")
    			.setParameter("idPerson", idPerson).getResultList();
    }

}
