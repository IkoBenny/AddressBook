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
	
	public static void main(String [] args) {
		Contact c = new Contact("Mr. Fake", "123 Fake St", "Fakeville", "FA", "12345", "123-456-7890");
		Contact d = new Contact("Mr. Fake", "123 Fakdfse St", "Fakdfsseville", "FAsfd", "12dfs345", "123-456-7sfs890");
		c = (Contact)d.clone();
		Contacts book = new Contacts();
		book.add(c);
		book.add(d);
		//book.delete("Mr. Fake");
		book.display();
	}
	
	

}
