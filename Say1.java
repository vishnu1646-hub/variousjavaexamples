package lambdaexamples;

public class Say1 {
	public static void main(String[] args) {
		Say s=()->{
			return "hello buddy";
		};
		System.out.println(s.sayit());
	}

}
