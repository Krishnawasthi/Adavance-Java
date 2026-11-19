package finance.dependency.injection.beans.spring.setter;

import org.springframework.context.annotation.Bean;

import finance.dependency.injection.beans.spring.setter.Address1;
import finance.dependency.injection.beans.spring.setter.Employee1;
public class SpringConfig1 {
	@Bean
	public Address1 address1() {
		
	return new Address1("932","btm layout","bengaluru","india");
		
	}
	
	@Bean
	public Employee1 employee() {
		
		Employee1 emp = new Employee1("krishna","km!232");
		emp.setAddress(address1());
		return emp;
	}

}
