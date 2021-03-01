package assignments;

public class ChangeSequence3 {

	public static void main(String[] args) {
		String string = "MYHOMEISJEWEL";
		StringBuilder string1 = new StringBuilder();
		System.out.print("required output is: ");
		string1.append(string.substring(8, 13));
		string1.append(string.substring(6, 8));
		string1.append(string.substring(0, 2));
		string1.append(string.substring(2, 6));
		System.out.println(string1);

	}


}
