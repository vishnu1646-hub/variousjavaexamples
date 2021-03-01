package java8streams;

import java.util.Arrays;

public class Sorting1 {
	public static void main(String[] args) {
		int[] i={5,8,9,4,3,7,2,1};
		Arrays.parallelSort(i);
		Arrays.stream(i).forEach(s->{System.out.println(s);});
		
	}

}
