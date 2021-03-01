package assignments;

import java.util.Scanner;

public class Checking6 {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int toCountAlphabets=0;
		int toCountNumeric=0;
		int toCountSpecial=0;
		System.out.println("enter the string: ");
		String input=scanner.nextLine();
		for (int i = 0; i <input.length(); i++) {
			char ch=input.charAt(i);
			if(Character.isAlphabetic(ch)){
				toCountAlphabets++;
			}else if(ch>='0'&&ch<='9'){
				toCountNumeric++;
			}else{
				toCountSpecial++;
			}
		}
		if(input.length()==toCountAlphabets){
			System.out.println("given string contains only alphabets ");
		}
		System.out.println("Number of alphabets in given string :"+toCountAlphabets);
		System.out.println("Number of numeric values in string :"+toCountNumeric);
		System.out.println("number of special characters in given string :"+toCountSpecial);
	}

}
