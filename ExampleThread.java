package assignments;

public class ExampleThread extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[] args) {
		ExampleThread e = new ExampleThread();
		e.start();
	}
}
