package Technological.test.dependency.injection;

public class Employee1 {
	String name;
	String id;
	String department;
	Address1 address;
	
	//so here is the dependency of object employee on the object of address class  
	
	// HAS - A  relation between both class
	//Employee HAS-A Address object
	
	public Employee1(String name, String id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		
	}
	//injecting dependency using setter
	public void setAddress(Address1 address) {
		
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", address=" + address + "]";
	}
}
