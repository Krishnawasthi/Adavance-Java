package com.maphsis.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.maphsis.Employee;

public class Driver {

	public static void main(String[] args) {
		
		String classPath = "beans.xml";
		
		//create an ioc container
		ApplicationContext iocContainer = new ClassPathXmlApplicationContext(classPath);
		
		//retrieving the 1st bean 
		Employee employee =  (Employee) iocContainer.getBean("emp1");
		System.out.println(employee.getName());
		System.out.println(employee.getId());
		
		
	    //retieveing the 2nd bean
		Employee employee1 =  (Employee) iocContainer.getBean("emp2");
		System.out.println(employee1.getName());
		System.out.println(employee1.getId());
		
		System.out.println(employee == employee1);
		 
	}

}
