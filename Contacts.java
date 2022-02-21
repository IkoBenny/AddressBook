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
	
	public int getIndex(String name) {
		int index = 99;
		for(int i = 0; i < contacts.size(); i++ ) {
			if (contacts.get(i).getName().equals(name))
				index = i;			
		}
		return index;
	}

	public Contact delete() {
		Contact c = null;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter contact's full name: ");
		name = in.nextLine();
		int index = getIndex(name);
		c = get(name);
		contacts.remove(index);
		return c;		
	}

	
	public Contact get(String name) {
		Contact contact = null;
		for (int i =0; i < contacts.size(); i ++) {
			if (contacts.get(i).getName().equals(name))
				contact = contacts.get(i);
		}
		return contact;
	}

	public Contact create() {
		Contact c;
		Scanner in = new Scanner(System.in);
		String name, street, city, state, zip, phone;
		System.out.println("Enter contact's full name: ");
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
		//in.close();
		c = new Contact(name, street, city, state, zip, phone);
		return c;
	}
	
	public Contact update() {
		Contact c = create();
		String name = c.getName();
		Contact old = get(name);
		int index = getIndex(name);
		contacts.set(index, c); 
		return old;
	}

	public void display() {
		for (Contact c : contacts) {
			System.out.println(c.toString());
		}
	}

	public static void main(String [] args) {
		Contacts book = new Contacts();
		Contact sample = new Contact ("John", "123 Fake St.", "Fakeville", "Fakeland", "12345", "123-456-7890");
		Contact sample2 = new Contact ("Johngdfg", "123 Fake St.", "Fakeville", "Fakeland", "12345", "123-456-7890");
		Contact sample3 = new Contact ("Jdfgdohn", "123 Fake St.", "Fakeville", "Fakeland", "12345", "123-456-7890");
		book.add(sample);
		book.add(sample2);
		book.add(sample3);
		System.out.println(book.getIndex("Jdfgdohn"));
		
	}
}
