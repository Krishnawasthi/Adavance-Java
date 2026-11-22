package learning.com.bean.life.cycle.understndings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.com.bean.life.cycle.understndings.config.EmpConfig;
import learning.com.bean.life.cycle.understndings.employee.Employee;
import learning.com.bean.life.cycle.understndings.employee.mgt.EmployeeMgt;

public class App {
	public static void main(String[] args) {
 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		EmployeeMgt empMgt = context.getBean(EmployeeMgt.class);
		empMgt.empMgtdetails();
		
		//second bean
		
		System.out.println("-------------------------------------------------------------------------");
		EmployeeMgt empMgt1 = context.getBean(EmployeeMgt.class);
		empMgt1.empMgtdetails();
		
		context.close();
	}
}