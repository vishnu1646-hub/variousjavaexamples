package ioexamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:/Users/tech/Documents/examples/some.txt");
		f.write(65);
		f.close();

		System.out.println("success");
	}

}
