package assignments;

import java.util.Scanner;

public class CamelToSnake1 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter camel case:");
		String camel = scanner.nextLine();
		System.out.print("snake case is:");
		for (int i = 0; i < camel.length(); i++) {
			char ch = camel.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				if (i != 0)
					System.out.print('_');
				System.out.print((char) (ch + 32));
			} else {
				System.out.print(ch);
			}
		}

	}

}
