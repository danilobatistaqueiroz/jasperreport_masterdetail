package com.labs.tests;


import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.labs.model.Client;
import com.labs.model.EmailAddress;
import com.labs.model.Person;
import com.labs.report.GenerateReport;

public class ReportsTest {

	@Test
	public void generatePersonsTest()
	{

	}
	
	@Ignore
	@Test
	public void generateClientsTest()
	{
		try{
			List<Client> clients = new ArrayList<Client>();
			
			Client Client1 = new Client();
			Client1.setName("TI Labs");
			Client1.setAddress("132, My Street");
			Client1.setPostalCode("BT274DP");
			Client1.setPhone("8888-5566");
			Client1.setZipCode("BT");
			
			Client Client2 = new Client();
			Client2.setName("Pepper Jonh");
			Client2.setAddress("9214 Lake St.");
			Client2.setPostalCode("G15HF");
			Client2.setZipCode("GA");
			
			Client Client3 = new Client();
			Client3.setName("FLC Technology");
			Client3.setAddress("44 Shirley Ave.");
			Client3.setPostalCode("WC2R");
			Client3.setPhone("98523-1234");
			Client3.setZipCode("WC");
			
			
			clients.add(Client1);
			clients.add(Client2);
			clients.add(Client3);
			
			
			GenerateReport creport = new GenerateReport();
			creport.generate(clients, "Clients");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
