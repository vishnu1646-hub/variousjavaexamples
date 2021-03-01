package java8streams;

import java.util.Optional;

public class ExampleOptional2 {
	public static void main(String[] args) {
		Optional<String> got = Optional.of("Game Of Thrones");
		Optional<String> nothing=Optional.empty();
		System.out.println(got.map(String::toLowerCase));
		System.out.println(nothing.map(String::toLowerCase));
		Optional<Optional<String>> anotherOPtional = Optional.of(Optional.of("breaking news"));
		System.out.println(anotherOPtional);
		System.out.println(anotherOPtional.map(gender->gender.map(String::toUpperCase)));
		System.out.println(anotherOPtional.flatMap(gender->gender.map(String::toUpperCase)));
	}

}
