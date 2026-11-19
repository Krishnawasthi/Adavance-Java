package learning.com.bean.life.cycle.employee;

public class Employee {
	
	String name;
	String id;
	double salary;
	
	Address address;
	
	public Employee(String name, String id, double salary, Address address ) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		
	}

	
	public String empDetails() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address.empAddress() + "]";
	}

	

}
