package learning.com.creation.bean.multiple.type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import learning.com.creation.bean.multiple.type.employee.Employee;

@Configuration //	Marks a class as a source of Spring bean configuration.

@ComponentScan (basePackages = "learning.com.creation.bean.multiple.type") //Tells Spring which packages to scan for component classes.
public class SpringConfig {
	
	@Bean //Registers the object returned by a method as a Spring bean.
	public Employee employee() {
		
		Employee emp = new Employee("krishna","awasthi","km!2322", 2300000);
		return emp;
	}

}
