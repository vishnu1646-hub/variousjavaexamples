package ioexamples;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Flushing {
	public static void main(String[] args) throws Exception {
		FileOutputStream f1 = new FileOutputStream("C:/Users/tech/Documents/examples/some.txt");
		FileOutputStream f2 = new FileOutputStream("C:/Users/tech/Documents/examples/some1.txt");
		FileOutputStream f3 = new FileOutputStream("C:/Users/tech/Documents/examples/some3.txt");
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		String s="CAPTAINMARVEL";
		byte[] b1 = s.getBytes();
		b.write(b1);
		b.writeTo(f1);
		b.writeTo(f2);
		b.writeTo(f3);
		b.flush();
		b.close();
		System.out.println("success");
	}

}
