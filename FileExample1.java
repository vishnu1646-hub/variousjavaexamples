package ioexamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExample1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:/Users/tech/Documents/examples/some.txt");
	    String s="helo good moning";
	    byte[] b = s.getBytes();
	    f.write(b);
	    f.close();
	    System.out.println("success");
	}

}
