package threads;

public class IntraThreadBank {
	private int bal = 25000;

	public synchronized void withdraw(int amount) {
		System.out.println("Withdraw start....");
		if (amount > bal) {
			System.out.println(" we dont have sufficient amount,We need to wait until deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			bal=bal-amount;
			System.out.println(amount+"Rupees withdraw successfully remaining balance is:"+bal);
			System.out.println("Withdraw End...!");
			

		}
		public synchronized void deposit(int amount)
		{
		 System.out.println("Deposite Start");
		 bal=bal+amount;
		 System.out.println(amount+"rupees deposited sucessfully Total bal is"+bal);
		 System.out.println("Deposit end...");
		 notify();
		}
	

	public static void main(String[] args) {
		IntraThreadBank bank=new IntraThreadBank();
		Thread thread1=new Thread() { //anonymous block or inner class...
			public void run()
			{
				bank.withdraw(40000);
			}
		};
		Thread thread2=new Thread() {
			public void run() {
				bank.deposit(30000);
			};
		};
thread1.start();
thread2.start();
	}

}
