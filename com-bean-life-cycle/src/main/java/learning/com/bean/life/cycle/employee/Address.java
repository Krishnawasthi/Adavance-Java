package learning.com.bean.life.cycle.employee;

public class Address {
	
	String line1;
	String line2;
	String city;
	String state;
	
	
	public String empAddress(){
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + "]";
	}

	public Address(String line1, String line2, String city, String state) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
	}
	

}
