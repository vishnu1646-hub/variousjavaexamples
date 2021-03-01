package java8streams;

import java.util.Optional;

public class ExampleOptional {
	public static void main(String[] args) {
		Optional<String> value1 = Optional.of("maddy");
		Optional<String> nothing = Optional.empty();

		if (value1.isPresent()) {
			System.out.println("you are rocking");
		} else {
			System.out.println("boring without maddy");
		}

		value1.ifPresent(s -> {
			System.out.println("maddy's attitude is crazy");
		});
		nothing.ifPresent(s -> {
			System.out.println(" without maddy life is boring ");
		});
		System.out.println("****************");
		System.out.println(value1.orElse("default value"));
		System.out.println(nothing.orElse("default value"));
		System.out.println("///////////");
		System.out.println(value1.orElseGet(() -> "default value"));
		System.out.println(nothing.orElseGet(() -> "default value"));

	}

}
