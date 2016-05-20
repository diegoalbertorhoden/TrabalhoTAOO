package br.rhoden.comum;

import org.hibernate.Session;

import br.rhoden.persistencia.Hibernate;

public class Cadastrar {
	
	Session session = Hibernate.getSessionFactory().openSession();
	
	session.beginTransaction();
	
	Cliente cli = new Cliente("nome", "telefone", "endereco");
	
	session.getTransaction().commit();
	
	session.close();
	
	Hibernate.finalizar();
	
	

}
