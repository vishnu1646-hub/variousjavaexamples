package java8streams;

import java.util.Optional;

public class ExampleOptional3 {
	public static void main(String[] args) {
		Optional<String> got = Optional.of("Game Of Thrones");
		System.out.println(got.filter(s->s.equals("game of thrones")));
		System.out.println(got.filter(s->s.equalsIgnoreCase("game of thrones")));
	}

}
