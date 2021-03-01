package serializationexamples;

import java.io.Serializable;

public class Employee implements Serializable {
	public String name;
	public int number;
	public transient String email;
	public String address;
	public void addressCheck(){
		System.out.println("name is :"+name+"and address is :"+address);
	}

}
