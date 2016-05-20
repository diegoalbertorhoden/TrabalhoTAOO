package br.rhoden.persistencia;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Hibernate {

	private static ServiceRegistry registry;
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory(){
		
		registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		
		SessionFactory sessionFactory = null;
		try{
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}catch (Exception e){
		e.printStackTrace();
		StandardServiceRegistryBuilder.destroy(registry);
	}
		return sessionFactory;
		
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory ;
	}
	
	public static void finalizar(){
		StandardServiceRegistryBuilder.destroy(registry);
	}
	
}
