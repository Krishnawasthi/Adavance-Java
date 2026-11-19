package Learning.com.bean.scope.prototype.employee;

public class Employee {
	
   String name;
   String id;
   String department;
   String salary;
   public Employee(String name, String id, String department, String salary) {
	super();
	this.name = name;
	this.id = id;
	this.department = department;
	this.salary = salary;
   }
   @Override
   public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
   }

}
