package ioexamples;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ExampleByteInput {
	public static void main(String[] args) throws Exception {
		byte[] b={35,36,37,38,39};
		ByteArrayInputStream b1 = new ByteArrayInputStream(b);
		int i=0;
		while(i!=-1){
			System.out.print((char)i);
			i=b1.read();
		}
		b1.close();
	}

}
