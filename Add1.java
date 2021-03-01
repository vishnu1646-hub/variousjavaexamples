package lambdaexamples;

public class Add1 {
	public static void main(String[] args) {
		Add a1=(a,b)->(a+b);
		System.out.println(a1.add(2, 3));
		
		Add a2=(a,b)->(a*b);
		System.out.println(a2.add(5, 5));
		
		Add a3=(a,b)->(a-b);
		System.out.println(a3.add(100, 5));
		
		Add a4=(a,b)->{
			return (a+b);
		};
		System.out.println(a4.add(1, 2));

		
	}

}
