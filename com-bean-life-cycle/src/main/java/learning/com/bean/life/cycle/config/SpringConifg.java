package learning.com.bean.life.cycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learning.com.bean.life.cycle.employee.Address;
import learning.com.bean.life.cycle.employee.Employee;

@Configuration
public class SpringConifg {
	
	
	@Bean("emp1")
	public Employee empData() {
		
		
		Address address = new Address("reddy pg", "btm layout","bengaluru", "karnataka");
		Employee emp = new  Employee("krishna","km@121",2342424, address);
		return emp;
		
	}

}
