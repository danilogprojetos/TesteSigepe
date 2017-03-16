package main.sigepe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.banco.dao.Cliente;

public class MainTeste {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		if (c.setNum(1517))
		c.setBai("Vila morangeuria");
		
		
		
		
				
		
		//Gerenciador de Entidades EntityManager
		//Padrão de Projeto Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testeSigepe");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
