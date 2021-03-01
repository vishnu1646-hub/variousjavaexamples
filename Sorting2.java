package java8streams;

import java.util.Arrays;

public class Sorting2 {
	public static void main(String[] args) {
		int[] i={5,8,9,4,3,7,2,1};
		Arrays.parallelSort(i,1,7);
		Arrays.stream(i).forEach(s->{System.out.println(s);});
	}

}
