package assignments;

public class TernaryOperator {
	public static void main(String[] args) {
		int max=0;
		int a=25;
		int b=53;
		int c=52;
		max=a>b?(a>b?a:c):(b>c?b:c);
		System.out.println(max);
	}

}
