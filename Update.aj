package aop;

public aspect Update {

	pointcut update(Contacts book): 
		target(book) &&
		call(Contact Contacts.update(String));
		 
	
	after(Contacts book) returning (Contact c): update(book){		
		Log log = new Log(c);
		log.writeUpdate();
	}
}
