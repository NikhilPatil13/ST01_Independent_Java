// this class provides factory to our program
package com.notetaker.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory factory;

	public static SessionFactory getFactory()
	{	
		// when nothing is in factory then build the factory
		if(factory == null) 
		{
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		
		return factory;
	}
	
	public void closeFactory() 
	{
		if(factory.isOpen())
		{
			// if facotry is alreay open then need to close it
			System.out.println("factory is closing...");
			factory.close();
			System.out.println("factory is closed...");
		}
		
	}

}