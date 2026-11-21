package learning.com.creation.bean.multiple.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.com.creation.bean.multiple.type.component.EmployeeMgt;
import learning.com.creation.bean.multiple.type.config.SpringConfig;
import learning.com.creation.bean.multiple.type.employee.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       EmployeeMgt emp1 =  context.getBean(EmployeeMgt.class);
       emp1.empMGTDetails();
    
    }
}
