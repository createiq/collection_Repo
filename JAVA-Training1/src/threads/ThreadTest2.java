package threads;

class MyThread2 extends Thread {
	public void start() {
		super.start();
		System.out.println("start");
	}

	public void run() {
		System.out.println("run");
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		mt2.start();
		System.out.println("main");

	}

}
