package streams.assignment;
public class Address {
	private String pinCode;
	private String city;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String pinCode, String city) {
		this.pinCode = pinCode;
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
