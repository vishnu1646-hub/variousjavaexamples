package assignments;

import java.util.Scanner;

public class Factorial {

    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the factorial number to find: ");
		int factorial=scanner.nextInt();
		factorialMethod(factorial);

	}
	private static void factorialMethod(int factorial) {
		for(int j=factorial-1;j>1;j--){
			factorial=factorial*j;
		}
		System.out.println("factorial of a number is :"+factorial);
		
	}


}
