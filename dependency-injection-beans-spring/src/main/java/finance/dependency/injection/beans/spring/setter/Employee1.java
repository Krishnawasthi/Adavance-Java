package finance.dependency.injection.beans.spring.setter;

import finance.dependency.injection.beans.spring.setter.Address1;

public class Employee1 {
	
		
		String name;
		String id;
		Address1 address;

		public Employee1(String name, String id) {
			super();
			this.name = name;
			this.id = id;
			
		}

		public void setAddress(Address1 address1) {
			
			this.address = address1;
		}
		
		public String displayEmployee() {
			return "Employee [name=" + name + ", id=" + id + ", address=" + address.displayAddress() + "]";
		}	
		
	}

