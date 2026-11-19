package finance.dependency.injection.beans.spring.address;

public class Address {
	
	String line1;
	String area;
	String city;
	public Address(String line1, String area, String city) {
		super();
		this.line1 = line1;
		this.area = area;
		this.city = city;
	}

	
	public String displayAddress() {
		return "Address [line1=" + line1 + ", area=" + area + ", city=" + city + "]";
	}

}
