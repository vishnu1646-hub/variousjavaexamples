package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S5 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		List<Integer> l1 = num.stream().map(n->n*n).collect(Collectors.toList());
		l1.forEach(System.out::println);
	}

}
