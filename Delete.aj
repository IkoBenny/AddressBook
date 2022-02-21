package aop;

public aspect Delete {

	pointcut delete(Contacts book):
		target(book) &&
		call(Contact Contacts.delete());
	
	after(Contacts book) returning (Contact c): delete(book){
		Log log = new Log(c);
		log.writeDelete();
	}
}
