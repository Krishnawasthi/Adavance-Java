package finance.dependency.injection.beans.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import finance.dependency.injection.beans.spring.address.Address;
import finance.dependency.injection.beans.spring.employee.Employee;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public Address address() {
		
	return new Address("932","btm layout","bengaluru");
		
	}
	
	@Bean
	public Employee employee() {
		
		Employee emp = new Employee("krishna","km!232",address());
		return emp;
	}

}
