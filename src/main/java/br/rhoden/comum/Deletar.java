package br.rhoden.comum;

import org.hibernate.Session;

import br.rhoden.persistencia.Hibernate;

public class Deletar {
	
	public static void main(String[] args) {
		
		Session session = Hibernate.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Cliente cl = session.get(Cliente.class, 2L);
				
		session.delete(cl);
		
		session.getTransaction().commit();
		
		session.close();
		
		Hibernate.finalizar();
		
	}

}
