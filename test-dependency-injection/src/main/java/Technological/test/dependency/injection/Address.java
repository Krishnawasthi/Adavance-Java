package Technological.test.dependency.injection;

public class Address
{
	String line1;
	String line2;
	String landmark;
	String area;
	String pincode;
	String city;
	String state;

	public Address(String line1, String line2, String landmark, String area, String pincode, String city, String state) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.landmark = landmark;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", landmark=" + landmark + ", area=" + area + ", pincode="
				+ pincode + ", city=" + city + ", state=" + state + "]";
	}

}
