package assignments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class ExampleRevisit {
	public static void main(String[] args) throws Exception {
                  FileWriter f = new FileWriter("C:/Users/tech/Documents/examples/smallexample.csv");
                  StringJoiner s=new StringJoiner(",");
                  s.add("sam;");
                  s.add("jam");
                  s.add(";");
                  s.add("ben");
                  s.add("\r\n");
                  s.add("sap");
                  f.write(s.toString());
                  f.close();
                  System.out.println("finished");
	}

}
