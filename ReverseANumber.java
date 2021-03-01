package assignments;

public class ReverseANumber {
	public static void main(String[] args) {
		int num=1646;
		int rem=0;
		int reverse=0;
		while(num>0){
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
