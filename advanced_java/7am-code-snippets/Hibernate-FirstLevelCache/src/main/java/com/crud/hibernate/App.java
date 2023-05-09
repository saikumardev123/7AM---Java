package com.crud.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

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
        User user = session.get(User.class,3);
       User user2 =  session.get(User.class, 3);
       User user3 =  session.get(User.class, 3);
       System.out.println(user.getEmail());
       System.out.println(user2.getEmail());
       System.out.println(user3.getEmail());
       
       session.close();
       
       System.out.println("-------------------------------------------------");
       Session session2= sessionFactory.openSession();
       User user4 = session2.get(User.class, 3);
       User user5 = session2.get(User.class, 3);
         
    }
}
