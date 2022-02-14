package aop;

public class Main {

	public static void main(String[] args) {
		Contact sample = new Contact ("John", "123 Fake St.", "Fakeville", "Fakeland", "12345", "123-456-7890");
		Contacts book = new Contacts();
		book.add(sample);
		book.update("John");
		book.delete("Hewey");
	}

}
