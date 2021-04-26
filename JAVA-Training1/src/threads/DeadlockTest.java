package threads;

public class DeadlockTest {

	public static void main(String[] args) {
		Resource1 r1=new Resource1();
		Resource2 r2=new Resource2();
		Thread t1=new Thread() {
			public void run() {
				synchronized (r1) {
					System.out.println("r1 is available for t1 waiting for r2");
					synchronized (r2) {
						System.out.println("R1 and r2 both are available T1 task completed");
						
					}
					}
					
				}
			};
			Thread t2=new Thread() {
				@Override
				public void run() {
synchronized (r2) {
	System.out.println("r2 is available for t2 wating for r1");
	synchronized (r1) {
		System.out.println("R1 and r2 both are available T2 task completed");
		
	}
	
        }					
	}
			};
		t1.start();
		t2.start();

	}

}
