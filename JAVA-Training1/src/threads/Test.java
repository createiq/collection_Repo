package threads;

public class Test {
	
	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1("Balaji Thread");
		t1.setName("Balaji Thread");
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("Raja Thread");
		ThreadDemo1 t3 = new ThreadDemo1();
		t3.setName("Rajiv Thread");
		t1.setPriority(8);
		t1.start();
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	}

}


