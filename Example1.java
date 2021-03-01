package lambdaexamples;

public class Example1 {
	public static void main(String[] args) {
		new Thread(()->{System.out.println("new thread is created");}).start();
	}

}
