package assignments;

import java.util.Scanner;

public class ReverseAStringExample {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the string : ");
		String s = scanner.nextLine();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			s1 = ch + s1;
		}
		System.out.println("reverse string : " + s1);

	}

}
