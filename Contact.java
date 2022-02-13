package aop;

public class Contact {
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
	
	public static void main(String [] args) {
		Contact c = new Contact("Mr. Fake", "123 Fake St", "Fakeville", "FA", "12345", "123-456-7890");
		Contact d = new Contact("Mr. Fake", "123 Fake St", "Fakeville", "FA", "12345", "123-456-7890");
		Contacts book = new Contacts();
		book.add(c);
		book.add(d);
		book.delete("Mr. Fake");
		book.display();
	}

}
