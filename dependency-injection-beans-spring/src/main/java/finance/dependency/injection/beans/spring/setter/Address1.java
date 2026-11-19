package finance.dependency.injection.beans.spring.setter;

public class Address1 {
	String line1;
	String area;
	String city;
	String country;
	public Address1(String line1, String area, String city, String country) {
		super();
		this.line1 = line1;
		this.area = area;
		this.city = city;
		this.country = country;
	}

	
	public String displayAddress() {
		return "Address [line1=" + line1 + ", area=" + area + ", city=" + city + ", country=" + country + "]";
	}

}
