package Technological.test.dependency.injection;

public class Driver1 {
	 //dependency injected through setter 
		public static void main(String args[]) {
			
			Address1 address = new Address1("921","4th cross", "btmlayout", "second stage","560079","bengaluru","karnataka");
			Employee1 emp = new Employee1("krishna","km@123","IT");
			
			 //dependency injected through setter  --> not mandatory
			//dependencies are optional
		    emp.setAddress(address);
			
		    address = new Address1("21","7th cross", "btmlayout", "1st stage","560078","bengaluru","karnataka");
		    emp.setAddress(address);
			System.out.println(emp.toString());
			System.out.println(address.toString());
			
		}
}
