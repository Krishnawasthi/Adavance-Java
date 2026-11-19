package learning.creating.beans.annotation.type.in.java.multipleclasses.Application;

import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.creating.beans.annotation.type.in.java.multipleclasses.component.Department;
import learning.creating.beans.annotation.type.in.java.multipleclasses.component.Employee;
import learning.creating.beans.annotation.type.in.java.multipleclasses.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
      Employee emp =  context.getBean(Employee.class);
      Department dept = context.getBean(Department.class);
      Service serv = context.getBean(Service.class);
      
      emp.showEmpDetailes();
      dept.showDepartmentDetailes();
      
    }
}
