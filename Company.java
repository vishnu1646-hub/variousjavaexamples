package lambdaexamples;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student(1, "hp",35000 ));
		a.add(new Student(2,"lenovo", 25000));
		a.add(new Student(3, "dell", 40000));
		System.out.println("sorting on basis of lapyname ");
		Collections.sort(a,(i1,i2)->{
			return i1.lapyName.compareTo(i2.lapyName );
		});
		for (Student student : a) {
			System.out.println(student.id+":"+student.lapyName+":"+student.cost);
			
		}
	}

}
