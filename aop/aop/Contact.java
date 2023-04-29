package aop;

public class Contact implements Cloneable {
	String name;
	String street;
	String city;
	String state;
	String zip;
	String phone;
	
	public Contact(String name, String street, String city, String state, String zip, String phone) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}
	
	public Object clone () {
		Object o = new Contact(this.name, this.street, this.city, this.state, this.zip, this.phone);
		return o;
	}
	
	public String toString() {
		return name + "\t" + street + ", " + city + " " + state + " " + zip + " "  + phone;
	}
	
	public String getName() {
		return name;
	}

	public boolean equals(Contact c ) {
		if(getName().equals(c.getName()))
			return true;
		else return false;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}	

}
