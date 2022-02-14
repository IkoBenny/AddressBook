package aop;

public aspect Update {

	pointcut update(): 
		call(Contact Contacts.update(String));
	
	after(): update(){
		System.out.println("Record Updated");
	}
}
