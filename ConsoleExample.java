package ioexamples;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console c=System.console();
		System.out.println("enter your name :");
		String s=c.readLine();
		System.out.println("this is "+s);
	}

}
