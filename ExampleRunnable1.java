package assignments;

public class ExampleRunnable1 implements Runnable {
	public void run() {
		System.out.println("Thread running due to interface");
	}

	public static void main(String[] args) {
		ExampleRunnable1 e = new ExampleRunnable1();
		Thread t = new Thread(e);
		t.start();

	}

}
