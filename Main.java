package aop;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Contacts book = new Contacts();
		int input = 99; 
		Scanner in = new Scanner(System.in);
		while(input == 0 == false) {
			//menu prompts
			System.out.println("Welcome to the Address Book Application by: Benny Iko");
			System.out.println("Press corresponding number key to execute a command, followed by ENTER");
			System.out.println("Press \"0\" to exit");
			System.out.println("Press \"1\" to add a contact");
			System.out.println("Press \"2\" to update an existing a contact");
			System.out.println("Press \"3\" to delete a contact");
			System.out.println("Press \"4\" to list all contacts");
			//keyboard input	
			input = in.nextInt();
			//address book functionality as branches
			if(input == 0) {
				in.close();
				break;
			}
			else if (input == 1)
				book.add();
			else if(input ==2) {
				System.out.println("Please enter the full name of the contact to be updated");			
				String temp = in.nextLine();
				book.update(temp);
			}
			else if(input == 3) {
				System.out.println("Please enter the full name of the contact to be updated");			
				String temp = in.nextLine();
				book.delete(temp);	
			}
			else
				book.display();	
		}
		
	}
}
