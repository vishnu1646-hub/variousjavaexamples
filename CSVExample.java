package assignments;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class CSVExample {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String strLine="";
		StringTokenizer strToken = null;
		boolean value = true;
		boolean proto = false;
		while (value) {
			FileOutputStream file = new FileOutputStream("C:/Users/tech/Documents/examples/assignment.csv",proto);
			BufferedOutputStream buffer = new BufferedOutputStream(file);
			StringJoiner s = new StringJoiner(",");
			System.out.println("enter first string :");
			String str = scanner.nextLine();
			s.add(str);
			System.out.println("enter second string :");
			String str1 = scanner.nextLine();
			s.add(str1);
			StringBuilder sB = new StringBuilder();
			String small = "\r\n";
			byte[] b = s.toString().getBytes();
			if (proto) {
				buffer.write(small.getBytes());
			}
			buffer.write(b);
			buffer.flush();
			buffer.close();
			file.close();
			System.out.println("successfully written in csv file ");
			System.out.println("************");
//			FileInputStream fileInput = new FileInputStream("C:/Users/tech/Documents/examples/assignment.csv");
//			BufferedInputStream buffer1 = new BufferedInputStream(fileInput);
			String ref = "C:/Users/tech/Documents/examples/assignment.csv";
			BufferedReader buffer1=new BufferedReader(new FileReader(ref));
			while (strLine != null) {
				strToken = new StringTokenizer(strLine, ",");
				while (strToken.hasMoreTokens()) {
					sB.append(strToken.nextToken());
				}
				strLine = buffer1.readLine();

			}
//			int i = 0;
//			while (i != -1) {
//				sB.append((char) i);
//				i = buffer1.read();
//			}
			buffer1.close();
			//fileInput.close();
			System.out.println("succesfully readed from csv file ");
			FileOutputStream fileWrite = new FileOutputStream("C:/Users/tech/Documents/examples/assigntoexcel.xls",proto);
			BufferedOutputStream buffer2 = new BufferedOutputStream(fileWrite);
			byte[] write = sB.toString().getBytes();
			if (proto) {
				buffer2.write(small.getBytes());
			}
			proto = false;
			buffer2.write(write);
			buffer2.flush();
			buffer2.close();
			fileWrite.close();
			System.out.println("successfully written in .xls file ");
			System.out.println("if you wanna add some more mention yes or no : ");
			String ex = scanner.nextLine();
			if (ex.equalsIgnoreCase("yes")) {
				value = true;
				proto = true;
				strLine="";
			} else {
				value = false;
			}
		}
	}

}
