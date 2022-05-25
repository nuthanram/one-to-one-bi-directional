package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("Q Spiders");
		company.setPhone(9874560052l);
		company.setWebsite("www.qspiders.com");
		
		GST gst=new GST();
		gst.setCompany(company);
		gst.setCountry("India");
		gst.setGstNumber(103987);
		gst.setState("karnataka");
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
		System.out.println("done");
	}
}
