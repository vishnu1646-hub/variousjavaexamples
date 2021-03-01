package assignments;

public class T_06 {
	public static int getMaxNumber(int a, int b, int c) {
		int large = 0;
		if (a <= 0 || b <= 0 || c <= 0) {
			return -1;
		}
		if (large < a) {
			large = a;
		}
		if (large < b) {
			large = b;
		}
		if (large < c) {
			large = c;
		}

		return large;
	}

	public static void main(String[] args) {
		System.out.println("largest number is: "+getMaxNumber(10, 89, 99));
	}

}
