package main.sigepe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTeste {

	public static void main(String[] args) {
		
		
		
		
		Cliente c = new   
		
		
				https://www.youtube.com/watch?v=xj8Fa0J33mY&list=PL4g7RIXo1tCreMlXmsoeM-zteILVU5GRj
		
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClienteJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist();
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
