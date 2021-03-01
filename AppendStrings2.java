package assignments;

import java.util.Scanner;

public class AppendStrings2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("add ten strings:");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			String s = scanner.nextLine();
		    stringBuilder.append(s);

		}
		System.out.println("appended strings :"+stringBuilder.toString());
		

	}


}
