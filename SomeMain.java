package lambdaexamples;

public class SomeMain {
	public static void main(String[] args) {
		StringFunction1 s1=(s)->s+"!";
		StringFunction1 s2=(s)->s+"?";
		printFormat("Hello", s1);
		printFormat("HI", s2);
	}
	public static void printFormat(String s1,StringFunction1 s2){
		String s3 = s2.running(s1);
		System.out.println(s3);
	}

}
