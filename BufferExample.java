package ioexamples;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:/Users/tech/Documents/examples/some.txt");
		BufferedOutputStream b = new BufferedOutputStream(f);
		String s="ironman";
		byte[] b1 = s.getBytes();
		b.write(b1);
		b.flush();
		b.close();
		f.close();
		System.out.println("success");
		}

}
