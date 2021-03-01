package ioexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceWriteExample {
	public static void main(String[] args) throws Exception {
		FileInputStream f1 = new FileInputStream("C:/Users/tech/Documents/examples/some.txt");
		FileInputStream f2 = new FileInputStream("C:/Users/tech/Documents/examples/some1.txt");
		FileOutputStream f3 = new FileOutputStream("C:/Users/tech/Documents/examples/some3.txt");
		SequenceInputStream s = new SequenceInputStream(f1, f2);
		int i=0;
		while (i != -1) {
			f3.write(i);
			i=s.read();
		}
		s.close();
		f3.close();
		f2.close();
		f1.close();
		System.out.println("success");
	}

}
