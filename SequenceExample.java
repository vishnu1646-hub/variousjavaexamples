package ioexamples;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceExample {
	public static void main(String[] args) throws Exception {
		FileInputStream f1 = new FileInputStream("C:/Users/tech/Documents/examples/some.txt");
		FileInputStream f2 = new FileInputStream("C:/Users/tech/Documents/examples/some1.txt");
		SequenceInputStream s = new SequenceInputStream(f1, f2);
		int i=0;
		while(i!=-1){
			System.out.print((char)i);
			i=s.read();
		}
		s.close();
		f2.close();
		f1.close();
	}
}
