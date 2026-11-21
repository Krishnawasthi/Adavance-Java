package learning.com.creation.bean.multiple.type.employee;

public class Employee {
	
  String firstName;
  String lastName;
  String empId;
  double salary;
  
  public Employee(String firstName, String lastName, String empId, double salary) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.empId = empId;
	this.salary = salary;
  }
  
  public void empDetails() {
	  
	  
	  System.out.println(firstName);
	  System.out.println(lastName);
	  System.out.println(empId);
	  System.out.println(salary);
	  
  }
    
}
