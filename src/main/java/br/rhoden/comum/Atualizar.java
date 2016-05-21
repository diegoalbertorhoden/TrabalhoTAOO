package br.rhoden.comum;

import org.hibernate.Session;

import br.rhoden.persistencia.Hibernate;

public class Atualizar {
	
	public static void main(String[] args) {
		
		Session session = Hibernate.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Cliente cl = session.get(Cliente.class, 1L);
		cl.setNome("teste");
		cl.setTelefone("teste");
		cl.setEndereco("teste");
		
		session.getTransaction().commit();
		
		session.close();
		
		Hibernate.finalizar();
	}

}
