package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		// Adding Students
		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));
		studentlist.add(new Student(55, "Maggie", 18));
		// Fetching student names as List
		List<Integer> names = studentlist.stream().map(n->n.id).collect(Collectors.toList());
		System.out.println(names);
	}

}
