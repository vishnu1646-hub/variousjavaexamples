package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters4 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the string: ");
		String string = scanner.nextLine();
		char ch[] = string.toCharArray();
		Set set = new HashSet();
		List repeating = new ArrayList();

		for (int i = 0; i < ch.length; i++) {
			if (set.contains(ch[i])) {
				repeating.add(ch[i]);
			} else {
				set.add(ch[i]);
			}
		}
		set.removeAll(repeating);
		System.out.println("repeating charcters are:" + repeating);
		System.out.println("unique characters are:" + set);

	}

}
