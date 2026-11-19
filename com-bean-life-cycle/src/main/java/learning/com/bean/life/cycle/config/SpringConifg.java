package learning.com.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learning.com.bean.life.cycle.employee.Address;
import learning.com.bean.life.cycle.employee.Employee;

@Configuration
public class SpringConifg {
	
	@Bean
	public Address empAddress1() {
		 
		return new Address("reddy pg", "btm layout","bengaluru", "karnataka");
		
	}
	
	@Bean
	public Employee empData() {
		Employee emp = new Employee();
		return emp;
		
	}

}
