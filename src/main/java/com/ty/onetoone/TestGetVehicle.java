package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehicle {
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction  entityTransaction=entityManager.getTransaction();
			Vehicle vehicle=entityManager.find(Vehicle.class, 3);
			if(vehicle!=null) {
				
				System.out.println(vehicle.getId());
				System.out.println(vehicle.getName());
				System.out.println(vehicle.getCost());
				System.out.println(vehicle.getCharcy().getCharcyno());
				System.out.println(vehicle.getCharcy().getType());
				
			}
			
			
		}
}
