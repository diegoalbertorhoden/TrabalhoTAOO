package br.rhoden.comum;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;


import br.rhoden.persistencia.Hibernate;

public class Ler {
	
	public static void main(String[] args) {
		Session session = Hibernate.getSessionFactory().openSession();
		
		Criteria crit = session.createCriteria(Cliente.class);
		
		@SuppressWarnings("unchecked")
		List<Cliente> lista = crit.list();
		
		for(Cliente cl: lista){
			System.out.println("\n\n cliente encontrado: ");
			System.out.println(cl);
		}
		
		System.out.println(lista.size() + "registros existentes.");
		session.close();
		Hibernate.finalizar();
	}

}
