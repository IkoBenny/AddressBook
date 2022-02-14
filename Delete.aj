package aop;

public aspect Delete {

	pointcut delete():
		call(Contact Contacts.delete(String));
	
	after(): delete(){
		System.out.println("Record deleted");
	}
}
