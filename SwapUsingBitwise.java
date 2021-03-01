package assignments;

public class SwapUsingBitwise {
	public static void main(String[] args) {
		int x=24;
		int y=42;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.print("x="+x+" , "+"y="+y);
	}

}
