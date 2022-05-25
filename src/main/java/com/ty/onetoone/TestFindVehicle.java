package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestFindVehicle {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Vehicle vehicle=entityManager.find(Vehicle.class, 3);
		vehicle.setName("Bajaj pulsar 200NS");
		Charcy charcy=vehicle.getCharcy();
		charcy.setType("bike-petrol");
		entityTransaction.begin();
		entityManager.merge(vehicle);
		entityTransaction.commit();
	}
}
