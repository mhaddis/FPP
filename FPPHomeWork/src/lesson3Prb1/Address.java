package lesson3Prb1;

public class Address {

	String street;
	String city;
	String state;
	String zip;
	
	public Address (String street,String city, String state, String zip)
	
	{
		this.street= street;
		this.city= city;
		this.state=state;
		this.zip=zip;
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
