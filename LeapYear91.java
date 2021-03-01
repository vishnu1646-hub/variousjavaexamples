package assignments;

public class LeapYear91 {
	public static void main(String[] args) {
		int enterYear = 2008;
		if((enterYear%4==0)&&(enterYear%100!=0||enterYear%400==0)){
			System.out.println("given year "+enterYear+" is a leap year ");
		}else{
			System.out.println("given year "+enterYear+" is not a leap year ");
		}
	}

}
