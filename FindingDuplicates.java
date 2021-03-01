package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindingDuplicates {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the array elements :");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		HashMap hm = new HashMap<>();
		for (Integer i : arr) {
			if (hm.containsKey(i)) {
				System.out.println("duplicate value= " + i);
			} else {
				hm.put(i, 1);
			}
		}

	}

}
