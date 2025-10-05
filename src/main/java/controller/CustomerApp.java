package controller;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("CMSPU");
		
		EntityManager em=factory.createEntityManager();
		
	/*EntityTransaction et=	em.getTransaction();
	et.begin();
	Customer c =new Customer("art", "Mumbai", 4446, LocalDate.parse("1984-08-15"));
	
		em.persist(c);
		et.commit();
		System.out.println("Hello"+" "+"Mr. "+" "+c.getCustomerName()+ " "+"your details added");
		
*/		
		
		
		
		
		
	}

}
