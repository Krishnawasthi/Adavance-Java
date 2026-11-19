package learning.com.bean.life.cycle;

import learning.com.bean.life.cycle.employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.com.bean.life.cycle.config.SpringConifg;
import learning.com.bean.life.cycle.employee.Employee;

public class App 
{
    public static void main( String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConifg.class);
       Employee emp =  context.getBean(Employee.class);
       
       System.out.println(emp.empDetails());
    }
}
