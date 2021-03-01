package ioexamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceVectorExample {
	public static void main(String[] args) throws Exception {
		FileInputStream f1 = new FileInputStream("C:/Users/tech/Documents/examples/some.txt");
		FileInputStream f2 = new FileInputStream("C:/Users/tech/Documents/examples/some1.txt");
		FileInputStream f3 = new FileInputStream("C:/Users/tech/Documents/examples/some3.txt");
		Vector v = new Vector();
		v.add(f1);
		v.add(f2);
		v.add(f3);
		Enumeration e = v.elements();
		SequenceInputStream s = new SequenceInputStream(e);
		int i=0;
		while(i!=-1){
			System.out.print((char)i);
			i=s.read();
		}
		s.close();
		//f3.close();
		//f2.close();
		f1.close();
		
		
	}

}
