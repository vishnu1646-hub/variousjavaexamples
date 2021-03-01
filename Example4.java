package lambdaexamples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example4 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(3);
		a.add(6);
		a.add(7);
		Consumer<Integer> lambd=(n)->System.out.println(n);
		a.forEach(lambd);
	}
}
