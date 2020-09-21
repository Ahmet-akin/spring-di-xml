package com.ravindra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

    public static void main(String[] args) {

       /* Product p = new Product("123", "Dell", 400);
        System.out.println(p.toString());
         */
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.ravindra");
        Product p =(Product)context.getBean("product ");
        p.setId("123");
        p.setName("Dell");
        p.setPrice(400);
        System.out.println(p.toString());
    }
}
