package aop;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	ArrayList<Contact> contacts;

	public Contacts() {
		contacts = new ArrayList<Contact>();
	}

	public void add(Contact c) {
		contacts.add(c);
	}
	
	public void add() {
		Contact c = create();
		contacts.add(c);
	}

	public Contact delete(String name) {
		Contact c = null;
		for (int i = 0; i < contacts.size(); i++) {
			if (name.equals(contacts.get(i).getName())) {
				c = contacts.get(i);
				contacts.remove(i);
			}
		}
		return c;
	}

	public Contact get(String name) {
		Contact contact = null;
		for (Contact c : contacts) {
			if (c.getName().equals(name))
				contact = c;
		}
		return contact;
	}

	public Contact create() {
		Contact c;
		Scanner in = new Scanner(System.in);
		String name, street, city, state, zip, phone;
		System.out.println("Enter contact name: ");
		name = in.nextLine();
		System.out.println("Enter street name: ");
		street = in.nextLine();
		System.out.println("Enter city name: ");
		city = in.nextLine();
		System.out.println("Enter state name: ");
		state = in.nextLine();
		System.out.println("Enter zip code: ");
		zip = in.nextLine();
		System.out.println("Enter phone number: ");
		phone = in.nextLine();
		in.close();
		c = new Contact(name, street, city, state, zip, phone);
		return c;
	}
	
	public Contact update(String name) {
		Contact c = get(name);
		Contact update = create();
		add(update);
		return c;
	}

	public void display() {
		for (Contact c : contacts) {
			System.out.println(c.toString());
		}
	}

}
