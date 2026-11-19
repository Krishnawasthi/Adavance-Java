package Technological.test.dependency.injection;

import Technological.test.dependency.injection.Address;

public class Employee {
	String name;
	String id;
	String department;
	Address address;
	
	//so here is the dependency of object employee on the object of address class  
	
	// HAS - A  relation between both class
	//Employee HAS-A Address object
	
	public Employee(String name, String id, String department, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", address=" + address + "]";
	}
	
}
