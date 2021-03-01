package assignments;

import java.time.LocalDateTime;

public class DatetimeToString12 {

	public static void main(String[] args) {
		// DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy/mm/dd
		// HH:mm:ss");
		// converting datetime to string.
		System.out.print(" conversion of datetime to string :");
		LocalDateTime now = LocalDateTime.now();

		// or
		// String s=now.toString();

		String string = String.valueOf(now);
		System.out.println(string);

		System.out.print(" conversion of string to datetime: ");
		// converting string to datetime
		LocalDateTime date = LocalDateTime.parse(string);
		System.out.println(date);

	}


}
