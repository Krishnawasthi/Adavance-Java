package learning.com.creation.bean.multiple.type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import learning.com.creation.bean.multiple.type.employee.Employee;

@Configuration //	Marks a class as a source of Spring bean configuration.

@ComponentScan (basePackages = "learning.com.creation.bean.multiple.type") //Tells Spring which packages to scan for component classes.
public class SpringConfig {
	
	@Bean("emp1") //Registers the object returned by a method as a Spring bean.
	public Employee employee1() {
		
		Employee emp = new Employee("krishna","awasthi","km!2322", 2300000);
		return emp;
	}
    
	@Bean("emp2")
	@Primary
	public Employee employee2() {
		
		Employee emp = new Employee("mukesh","gutka","mu!256", 45000);
		return emp;
		
	}
			
			
}
