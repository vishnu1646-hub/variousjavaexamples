package assignments;

public class DtoSAndStoD10 {

	public static void main(String[] args) {
		Double double1 = 19.0;
		String string = double1.toString();
		System.out.println("Double to String: " + string);

		Double double2 = Double.valueOf(string);
		System.out.println("String to Double: " + double2);

	}

}
