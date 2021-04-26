package threads;

class Mythreads extends Thread {
	public void run() {
		System.out.println("no arguments");
	}

	public void run(int i) {
		System.out.println("int args");
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		Mythreads mt = new Mythreads();
		mt.start();
	}

}
