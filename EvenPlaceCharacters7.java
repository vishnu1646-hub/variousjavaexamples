package assignments;

import java.util.Scanner;

public class EvenPlaceCharacters7 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the given string:");
		String string = scanner.nextLine();
		char[] ch = string.toCharArray();
		System.out.print("characters at even places: ");
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				System.out.print(ch[i]);
			}
		}

	}

}
