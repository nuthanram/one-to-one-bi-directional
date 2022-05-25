package com.ty.onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> persons=query.getResultList();
		for (Person person:persons) {
			System.out.println(person);
			Pan pan=person.getPan();
			System.out.println(pan);
			System.out.println("***********************");
		}
		
	}
}
