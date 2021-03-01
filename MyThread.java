package synchronizationexamples;

public class MyThread extends Thread {
	Table t;

	public MyThread(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(2);
	}

}
