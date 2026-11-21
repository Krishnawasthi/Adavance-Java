package learning.com.bean.life.cycle.employee;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	String name;
	String id;
	double salary;
	
	@Autowired //this is field injection (reflection APIs)
	//REFLECTION is nothing but the ability to read the private member of the class
	Address address;
	
	
	public String empDetails() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address.empAddress() + "]";
	}

	

}
