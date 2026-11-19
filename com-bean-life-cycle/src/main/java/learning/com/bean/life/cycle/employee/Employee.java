package learning.com.bean.life.cycle.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	String name;
	String id;
	double salary;
	
	@Autowired
	Address address;
	
	
	public String empDetails() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address.empAddress() + "]";
	}

	

}
