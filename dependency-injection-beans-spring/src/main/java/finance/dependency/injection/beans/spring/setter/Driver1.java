package finance.dependency.injection.beans.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.dependency.injection.beans.spring.setter.Address1;
import finance.dependency.injection.beans.spring.setter.Employee1;
import finance.dependency.injection.beans.spring.setter.SpringConfig1;


public class Driver1 {
	public static void main( String[] args )
    {
       ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig1.class);
            Employee1 emp = context1.getBean(Employee1.class);
            Address1 add = context1.getBean(Address1.class);
            
            System.out.println(emp.displayEmployee());

}
}