package com.udemy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.List;

public class App {
	public static void main(String[] args){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jdemeis.jpa"); 
		/*
		 * This emf parameter corresponds to the persistence-unit name in persistence.xml.
		 * jpa will then reference persistence.xml to see the unit's properties including database login details etc
		 */
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		
		//Query query = manager.createNativeQuery("SELECT * FROM PERSON_TABLE WHERE age<30" , Person.class);	
		TypedQuery<Person> query = manager.createNamedQuery("person.getAll",Person.class);
		
		List<Person> people = (List<Person>)query.getResultList();
		
		for(Person p : people){
			System.out.println(p);
		}
		
		manager.close();
		emf.close();
	}
}
