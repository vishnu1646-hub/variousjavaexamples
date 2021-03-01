package lambdaexamples;

import java.util.ArrayList;

public class ForeachLambda1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("raja");
		a.add("rani");
		a.add("rita");
		a.add("senorita");

		a.forEach((b) -> System.out.println(b)

		);
	}

}
