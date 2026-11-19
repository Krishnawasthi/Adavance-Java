package finance.dependency.injection.beans.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import finance.dependency.injection.beans.spring.address.Address;
import finance.dependency.injection.beans.spring.config.SpringConfig;
import finance.dependency.injection.beans.spring.employee.Employee;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            Employee emp = context.getBean(Employee.class);
            Address add = context.getBean(Address.class);
            
            System.out.println(emp.displayEmployee());
           
            
            
            
    }
}
