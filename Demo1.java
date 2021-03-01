package lambdaexamples;

public class Demo1 {
	public static void main(String[] args) {
		int print=16;
		Demo d = ()->{
			System.out.println("printing value :"+print);
		};
		d.print1();
	}

}
