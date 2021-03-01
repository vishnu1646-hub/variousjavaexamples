package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        Stream<String> s=names.stream();
        Stream<String> s1=s.filter(str->str.length()>6);
        s1.forEach(str1->{System.out.println(str1);});
        System.out.println("******************");
        List<String> l2 = names.stream().filter(str->str.length()>6&&str.length()<8).collect(Collectors.toList());
        l2.forEach(s12->{System.out.println(s12);});
	}

}
