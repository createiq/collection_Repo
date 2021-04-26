package inheritance;

public class Address {

	private String location;
	private String city;
	private String pincode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String location, String city, String pincode) {
		super();
		this.location = location;
		this.city = city;
		this.pincode = pincode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}


