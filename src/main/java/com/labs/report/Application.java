package com.labs.report;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.labs.model.EmailAddress;
import com.labs.model.Person;
import com.labs.tests.EmailAddressService;
import com.labs.tests.PersonService;

public class Application {

	private static void generatePerson(EntityManager em) throws Exception {
		PersonService personService = new PersonService(em);
		personService.generateData();
		EmailAddressService emailAddressService = new EmailAddressService(em);
		List<Person> persons = personService.listAll();
		emailAddressService.generateData(persons.get(0), persons.get(1), persons.get(2));
		persons.get(0).setEmailAddresses(persons.get(0).getEmailAddresses());
		persons.get(1).setEmailAddresses(persons.get(1).getEmailAddresses());
		//List<EmailAddress> emailAddresses = emailAddressService.listByPerson(idPerson);
		GenerateReport creport = new GenerateReport();
		creport.generate(persons, "Persons");
	}
	
	private static void generatePersonEmail() throws Exception {
		List<EmailAddress> emails = new ArrayList<EmailAddress>();
		Person person = new Person(1, "danilo", "sao paulo");
		EmailAddress email = new EmailAddress(1, person, "danilo@gmail.com");
		emails.add(email);
		EmailAddress email2 = new EmailAddress(2, person, "batista@gmail.com");
		emails.add(email2);
		EmailAddress email3 = new EmailAddress(3, person, "queiroz@gmail.com");
		emails.add(email3);
		person.setEmailAddresses(emails);
		Person person2 = new Person(2, "jasper", "rio");
		List<EmailAddress> emails2 = new ArrayList<EmailAddress>();
		EmailAddress email4 = new EmailAddress(4, person2, "jasper@gmail.com");
		emails2.add(email4);
		EmailAddress email5 = new EmailAddress(5, person2, "reports@gmail.com");
		emails2.add(email5);
		person2.setEmailAddresses(emails2);
		GenerateReport creport = new GenerateReport();
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person2);
		creport.generate(persons, "Persons");
	}
	
	private static void generateEmail() throws Exception {
		List<EmailAddress> emails = new ArrayList<EmailAddress>();
		Person person = new Person(1, "danilo", "sao paulo");
		EmailAddress email = new EmailAddress(1, person, "danilo@gmail.com");
		emails.add(email);
		EmailAddress email2 = new EmailAddress(2, person, "batista@gmail.com");
		emails.add(email2);
		EmailAddress email3 = new EmailAddress(3, person, "queiroz@gmail.com");
		emails.add(email3);
		Person person2 = new Person(2, "jasper", "rio");
		EmailAddress email4 = new EmailAddress(4, person2, "jasper@gmail.com");
		emails.add(email4);
		EmailAddress email5 = new EmailAddress(5, person2, "reports@gmail.com");
		emails.add(email5);
		GenerateReport creport = new GenerateReport();
		//creport.generate(emails, "Emails");
	}
	
	public static void main(String[] args) {
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonsPU");
			EntityManager em = emf.createEntityManager();
			
			generatePerson(em);
			//generateEmail();
			//generatePersonEmail();
			
			em.close();
			emf.close();
		}
		catch(Exception e){
			e.printStackTrace(System.err);
		}
	}
}
