package lambdaexamples;

public class Speak1 {
	public static void main(String[] args) {
		Speak s=(name)->{
			return "speaking: "+name;
		};
		System.out.println(s.speak("spanish"));
		
		Speak s1=name->{
			return "speaking: "+name;
		};
		System.out.println(s1.speak("italian"));

	}

}
