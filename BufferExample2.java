package ioexamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferExample2 {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:/Users/tech/Documents/examples/some.txt");
		BufferedInputStream b = new BufferedInputStream(f);
		int i=0;
		while(i!=-1){
			System.out.print((char)i);
			i=b.read();
		}
		
	
	}

}
