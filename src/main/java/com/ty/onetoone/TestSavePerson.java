package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		

		
		
		
		Pan pan=new Pan();
		pan.setAddress("faridabad sector 15");
		pan.setPanId("LKMNJ5675T");
		
		Person person=new Person();
		person.setName("kakusth ratna singh");
		person.setEmail("faridabadk@gmail.com");
		person.setPhone(7290092246l);
		pan.setPerson(person);
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("done");
	}
}
