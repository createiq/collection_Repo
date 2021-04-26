package threads;

public class ThreadDemo1 extends Thread{
	
	public ThreadDemo1() {
		super();
	}

	public ThreadDemo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread "+Thread.currentThread().getName());
			System.out.println("Priority "+Thread.currentThread().getPriority());
		}
	}

}

