package lambdaexamples;

public class LambdaThreadExample {
	public static void main(String[] args) {
		// without lambda
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("thread one is running");

			}
		};
		Thread t = new Thread(r);
		t.start();
		
		//creating thread using lambda
		
		Runnable r2=()->{
			System.out.println("thread two is running ");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		
	}

}
