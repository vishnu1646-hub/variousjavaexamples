package synchronizationexamples;

public class MyThread0 extends Thread{
	Table t;

	public MyThread0(Table t) {
		this.t = t;
	}
	public void run(){
		t.printTable(3);
	}
	

}
