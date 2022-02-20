package aop;

import java.io.File;
import java.io.FileWriter;   
import java.io.IOException;  


public class Log {
	File obj;
	FileWriter writer;
	Contact c;
	
	public Log(Contact c) {
		obj = new File("log.txt");
		this.c = c;
	}
	
	public void writeUpdate() {
		try {
			writer = new FileWriter(obj, true);
			writer.write("Record Updated:" + c.toString() + "\n");
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void writeDelete() {
		try {
			writer = new FileWriter(obj, true);
			writer.write("Record Deleted:" + c.toString() + "\n");
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
    
}
