package lambdaexamples;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class LambdEx1 {
	public static boolean isPrime(int number){
		IntPredicate i=index->number%index==0;
		return number>1&&IntStream.range(2,number).noneMatch(i);
				
	}
	public static void main(String[] args) {
		System.out.println(isPrime(9));
	}

}
