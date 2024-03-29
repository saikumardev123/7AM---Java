package com.spring.constructor.di.dependent.ConstructorDependentDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
       Product product = (Product)context.getBean("product");
       
       System.out.println(product.getName());
       System.out.println(product.getSeller().getSellerName());
    }
}
