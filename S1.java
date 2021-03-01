package java8streams;

import java.util.ArrayList;
import java.util.List;

public class S1 {
	public static void main(String[] args) {    
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println(count);
	}

}
