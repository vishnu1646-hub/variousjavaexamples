package java8streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S8 {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(1000);
		a.add(456);
		a.add(56789);
		a.add(123);
		a.forEach(s->{System.out.println(s);});
	}

}
