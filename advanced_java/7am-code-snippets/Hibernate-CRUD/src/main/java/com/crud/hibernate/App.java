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
       
          Transaction transaction =  session.beginTransaction();
          // create
//              User user = new User();
//              user.setEmail("raj@gmail.com");
//              user.setPassword("raj");
//              user.setUsername("raj");
//              session.save(user);
         
          // update
//        User user = new User();
//        user.setUserId(2);
//        user.setEmail("kiran@gmail.com");
//        user.setPassword("kiran123");
//      user.setUsername("kiran");
//        session.update(user);
        
           // delete
          
//        User user = new User();
//        user.setUserId(2);
//        user.setEmail("kiran@gmail.com");
//        user.setPassword("kiran123");
//      user.setUsername("kiran");
//        session.delete(user);
          
          // deleting based on userId
//          User user = new User();
//        user.setUserId(5);
//        session.delete(user);
            Query<User> query =  session.createQuery("from User");
            List<User> list =  query.list();
             Iterator<User> iterator = list.iterator();
             
             while(iterator.hasNext()) {
            	 User u1 =iterator.next();
            	 System.out.println(u1.getUserId() + "\t"+ u1.getUsername()+ "\t"+ u1.getPassword()+"\t"+ u1.getEmail());
             }
        
        
          transaction.commit();
    }
}
