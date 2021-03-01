package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class S3 {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("1","2","3");
		List<String> l2=Arrays.asList("maddy","buddy","sam");
        Stream<String> s = Stream.concat(l1.stream(), l2.stream());
        s.forEach(System.out::print);
	}
}