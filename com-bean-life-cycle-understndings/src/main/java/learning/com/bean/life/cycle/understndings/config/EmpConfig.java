package learning.com.bean.life.cycle.understndings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import learning.com.bean.life.cycle.understndings.employee.Employee;

@Configuration
@ComponentScan(basePackages = "learning.com.bean.life.cycle.understndings")
public class EmpConfig {
   
	@Bean
	@Scope("prototype")
	public Employee employee() {
		
		return new Employee("krishna", "km@123");
		
	}
}
