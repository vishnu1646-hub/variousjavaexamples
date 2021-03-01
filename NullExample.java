package java8streams;

import java.util.Optional;

public class NullExample {
	public static void main(String[] args) {
		String[] s=new String[10];
//		String str=s[5].substring(3, 5);
//		System.out.println(str);
		Optional<String> isNull=Optional.ofNullable(s[5]);
		if(isNull.isPresent()){
			String str=s[5].substring(3, 5);
			System.out.println(str);
		}else{
			System.out.println("cannot print null value ");
		}
		s[4]="maddy";
		Optional<String> isNull1=Optional.ofNullable(s[4]);
		if(isNull1.isPresent()){
			String str=s[4].substring(0, 5);
			System.out.println(str);
		}else{
			System.out.println("cannot print null value ");
		}	
		
		
	}

}
