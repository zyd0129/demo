package com.zyd.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*

         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("");
        for(String i:ctx.getBeanDefinitionNames()){
            System.out.println(i);
        };
        Student student = (Student) ctx.getBean("student");
        System.out.println(student.toString());
    }
}
