package lambdaexamples;

public class Test {
	public static void main(String[] args) {
		int a=9;
		Square s = (int x)->x*x;
		int i=s.calculate(a);
		System.out.println(i);
		
	}

}


