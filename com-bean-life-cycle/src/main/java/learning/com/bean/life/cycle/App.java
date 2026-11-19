package learning.com.bean.life.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.com.bean.life.cycle.config.SpringConifg;
import learning.com.bean.life.cycle.employee.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConifg.class);
       Employee emp = (Employee) context.getBean("emp1");
       
       System.out.println(emp.empDetails());
    }
}
