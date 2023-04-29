package aop;

import java.io.FileWriter;
import java.io.IOException;

public class Log {
	Contact c;

	public Log(Contact c) {
		this.c = c;
	}

	public void writeUpdate() {
		try {
			FileWriter writer = new FileWriter("output.txt");
			writer.write("Record Updated:" + c.toString() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeAdd() {
		try {
			FileWriter writer = new FileWriter("output.txt");
			writer.write("Record Added:" + c.toString() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeDelete() {
		try {
			FileWriter writer = new FileWriter("output.txt", true);
			writer.write("Record Deleted:" + c.toString() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
