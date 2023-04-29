package aop;

public aspect LogAspect {

	pointcut update(Contacts book): 
		target(book) &&
		call(Contact Contacts.update());
	
	pointcut add(Contacts book): 
		target(book) &&
		call(Contact Contacts.update());
	
	pointcut delete(Contacts book): 
		target(book) &&
		call(Contact Contacts.update());
		 
	after(Contacts book) returning (Contact c): update(book){		
		Log log = new Log(c);
		log.writeUpdate();
	}
	
	after(Contacts book) returning (Contact c): add(book){		
		Log log = new Log(c);
		log.writeAdd();
	}
	
	after(Contacts book) returning (Contact c): delete(book){		
		Log log = new Log(c);
		log.writeDelete();
	}
}
