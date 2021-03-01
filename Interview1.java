package assignments;

import java.util.Scanner;

public class Interview1 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the input ");
		String s = scanner.nextLine();
		int x = 0;
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ' && x == 1) {
				System.out.print((char) (ch + 1));

			} else {
				System.out.print(ch);
				if (ch == ' ')
					x = 1;

			}

		}
	}

}
