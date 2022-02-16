package aop;

import java.io.File;
import java.io.FileWriter;   
import java.io.IOException;  


public class Log {
	File obj;
	FileWriter writer;
	
	public Log() {
		obj = new File("log.txt");
	}
	
	public void write() {
		try {
			writer = new FileWriter(obj, true);
			writer.write("File Write Operation\n");
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
    
}
