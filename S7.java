package java8streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S7 {
	public static void main(String[] args) {
		List<Integer> l = Stream.iterate(5,count->count+1).filter(num->num%5==0).limit(10).collect(Collectors.toList());
		l.forEach(System.out::println);
	}

}
