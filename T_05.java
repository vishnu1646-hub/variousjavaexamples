package assignments;

public class T_05 {

	public static int sumOfMultiples(int a, int b, int c) {
		int x = 0;
		int y = 0;
		if (a <= 0 || b <= 0 || c <= 0) {
			return -1;
		}

		if (a % 10 != 0) {
			x = a % 10;
			y = 10 - x;
			a = a + y;

		}
		x = 0;
		y = 0;
		if (b % 10 != 0) {
			x = b % 10;
			y = 10 - x;
			b = b + y;

		}
		x = 0;
		y = 0;
		if (c % 10 != 0) {
			x = c % 10;
			y = 10 - x;
			c = c + y;

		}
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1, 12, 9));

	}

}
