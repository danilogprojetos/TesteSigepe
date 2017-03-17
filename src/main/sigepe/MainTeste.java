package main.sigepe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.python.core.exceptions;

import com.banco.dao.Cliente;

public class MainTeste {

	public static void main(String[] args) throws Exception {
		
			
				
		
		//Gerenciador de Entidades EntityManager
		//Padrão de Projeto Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testeSigepe");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Cliente a = em.find(Cliente.class, 10003);
		em.remove(a);
		//em.persist(c);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
