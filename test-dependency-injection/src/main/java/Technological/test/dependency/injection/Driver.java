package Technological.test.dependency.injection;

public class Driver {
   //dependency injected through constructor 
	public static void main(String args[]) {
		
		Address address = new Address("921","4th cross", "btmlayout", "second stage","560079","bengaluru","karnataka");
		Employee emp = new Employee("krishna","km@123","IT", address);
		
		System.out.println(emp.toString());
		System.out.println(address.toString());
		
	}
}
