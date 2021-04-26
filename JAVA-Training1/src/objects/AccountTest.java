package objects;

public class AccountTest {

	public static void main(String[] args) {

		Account account1=new Account(1100,"Dinesh",25000.00);
		
		Account account2=new Account(1200,"sairaj",15000.25);
		
//		System.out.println(account1.equals(account2));
		
		Account account=new Account(100,"varun",20000.55);
		System.out.println("account obj"+account);
		try {
			Account cloneAccount = (Account) account.clone();
			System.out.println(" cloneAccount obj " +cloneAccount);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
