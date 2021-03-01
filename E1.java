package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class E1 {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("raja","rani","rita","samuel","raja","rani");
		Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
