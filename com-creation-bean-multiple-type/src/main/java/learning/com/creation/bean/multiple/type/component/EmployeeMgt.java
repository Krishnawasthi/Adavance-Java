package learning.com.creation.bean.multiple.type.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import learning.com.creation.bean.multiple.type.employee.Employee;

@Component //Marks a class as a candidate for Spring-managed bean registration.
public class EmployeeMgt {
	
	@Autowired //Automatically injects a matching Spring bean into a dependency.
	@Qualifier("emp1")
	 Employee employee;
	
	public void empMGTDetails() {
		
		employee.empDetails();
	}
}
