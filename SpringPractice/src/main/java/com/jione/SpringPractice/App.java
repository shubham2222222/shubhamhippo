package com.jione.SpringPractice;

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
//        System.out.println( "Hello World!" );
//        Laptop1 object=new HP();
//        obj.disp();
    	
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
/*       Laptop1 obj=(Laptop1)context.getBean("dell");
//        obj.disp();
//        
//        Student obj=(Student)context.getBean("student");
//        obj.disp();
//        
//        Subject obj=(Subject)context.getBean("subject");
//        System.out.println(obj);*/
    	//DELL obj2=(DELL)context.getBean("DELL");
    //obj2.disp();
		ApplicationContext context =  new AnnotationConfigApplicationContext (Faculty.class);
		Student obj=context.getBean(Student.class);
		obj.disp();
    }
}
    