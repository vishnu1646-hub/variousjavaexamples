package java8streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NormalPrime {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(3);
		list.add(14);
		list.add(5);
		System.out.println(greaterTen(list));

	}

	private static int greaterTen(List<Integer> list) {
		Iterator<Integer> l = list.iterator();
		int sum = 0;
		while (l.hasNext()) {
			int num = l.next();
			if (num > 10)
				sum += num;
		}
		return sum;

	}

}
