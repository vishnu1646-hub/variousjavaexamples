package java8streams;

import java.util.StringJoiner;

public class StringExampleJoining {
	public static void main(String[] args) {
		StringJoiner s=new StringJoiner(",","{","}");
		s.add("maddy");
		s.add("buddy");
		s.add("yoyo");
		System.out.println(s);
	}

}
