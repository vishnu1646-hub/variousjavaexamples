package ioexamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileinputExample {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:/Users/tech/Documents/examples/some.txt");
		int i = f.read();
		while (i !=-1) {
			System.out.print((char) i);
			i=f.read();
		}

		f.close();

	}

}
