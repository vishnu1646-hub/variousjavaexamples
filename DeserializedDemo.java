package serializationexamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
	public static void main(String[] args) {
		Employee e=null;
		try{
			FileInputStream fi = new FileInputStream("C:/Users/tech/Documents/examples/r1.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			e=(Employee) oi.readObject();
			oi.close();
			fi.close();
		}catch(IOException io){
			io.printStackTrace();
			return;
		}catch(ClassNotFoundException c){
			System.out.println("class not found ");
			c.printStackTrace();
			return;
			
		}
		System.out.println("deserialized employee ");
		System.out.println("name :"+e.name);
		System.out.println("address :"+e.address);
		System.out.println("email  :"+e.email);
		System.out.println("number :"+e.number);
	}

}
