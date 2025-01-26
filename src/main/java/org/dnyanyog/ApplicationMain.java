package org.dnyanyog;

import org.dnyanyog.component.Address;
import org.dnyanyog.component.Student;
import org.dnyanyog.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

   public static void main(String[]args) {
	   
	   ApplicationContext spring =new AnnotationConfigApplicationContext(ApplicationConfig.class);
	   Student app =spring.getBean(Student.class);

        
        app.setFirstName("Vaibhav");
        app.getAddress().setCity("Pune");
        System.out.println(app.getAddress().getCity());
        
        System.out.println(app.firstName);

        
       Student std =new Student();
       std.setFirstName("Vaibhav");
       std.getAddress().setCity("Pune");
       System.out.println(std);
       System.out.println(std.getAddress().getCity());
       
        
}}
