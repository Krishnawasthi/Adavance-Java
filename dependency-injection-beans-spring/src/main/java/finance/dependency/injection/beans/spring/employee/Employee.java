package finance.dependency.injection.beans.spring.employee;

import finance.dependency.injection.beans.spring.address.Address;

public class Employee {
	
	String name;
	String id;
	Address address;

	public Employee(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	
	public String displayEmployee() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address.displayAddress() + "]";
	}	
	
}
