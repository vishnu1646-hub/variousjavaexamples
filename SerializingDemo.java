package serializationexamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="vishnu";
		e.number=1234567892;
		e.email="vishnu@gmail.com";
		e.address="gachibowli";
		try{
		FileOutputStream f = new FileOutputStream("C:/Users/tech/Documents/examples/r1.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		f.close();
		System.out.println("serialized data is stored in C:/Users/tech/Documents/examples/r1.ser this address");
		}catch(IOException i){
			i.printStackTrace();
			
		}
	}

}
