package java8streams;

import java.util.StringJoiner;

public class Example5 {
	public static void main(String[] args) {
		StringJoiner mystring = new StringJoiner(",");
		mystring.setEmptyValue("maddy is highly technical guy");
		System.out.println(mystring);
		System.out.println(mystring.length());
		System.out.println(mystring.toString());

	}

}
