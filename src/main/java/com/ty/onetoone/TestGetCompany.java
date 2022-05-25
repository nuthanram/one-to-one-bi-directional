package com.ty.onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from GST s");
		List<GST> gsts=query.getResultList();
		for (GST gst:gsts) {
			System.out.println(gst);
			Company company=gst.getCompany();
			System.out.println(company);
			System.out.println("***********************");
		}
	}
	
}
