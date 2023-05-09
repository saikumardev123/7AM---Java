package com.firstpp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      StandardServiceRegistry standardServReg =  new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
      
      Metadata metaData =  new MetadataSources(standardServReg).getMetadataBuilder().build();
      
      SessionFactory sessionFactory= metaData.getSessionFactoryBuilder().build();
      
      System.out.println("sessionFactory"+ sessionFactory);
      
     Session session =  sessionFactory.openSession();
     
        Transaction transaction =  session.beginTransaction();
        
        Movies movies = new Movies();
          movies.setBudget(9899);
          movies.setName("xyz");
          movies.setReleaseDate("12oct2023");
        session.save(movies);
        transaction.commit();
      
    }
}
