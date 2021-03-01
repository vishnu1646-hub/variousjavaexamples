package lambdaexamples;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(3);
		a.add(6);
		a.add(7);
		a.forEach((n)->System.out.println(n));
	}

}
