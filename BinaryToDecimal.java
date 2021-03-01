package assignments;

import java.util.Scanner;

public class BinaryToDecimal {

	static Scanner scanner = new Scanner(System.in);

	public static void binaryToDecimal(int binary) {
		int num=binary;
		int rem=0;
		int base=1;
		int temp=num;
		while (temp>0) {
		     int l_D=temp%10;
		     temp=temp/10;
		     rem=rem+l_D*base;
		     base=base*2;

		}
		System.out.println("decimal value is:" + rem);

	}

	public static void main(String[] args) {
		System.out.println("enter the binary value : ");
		int binary = scanner.nextInt();
		binaryToDecimal(binary);
	}

}
