package inheritance;

import java.util.Date;

public class ClientTest {
	
		public static void main(String[] args) {
			String name="hello world";
			String name2=new String("hello world");
			System.out.println(name2.length());
			System.out.println(name2.charAt(2));
			System.out.println(name2.isEmpty());
			Address currentAddress = new Address("sr nagar PS", "Hyd", "500030");
			Address perminentAddress = new Address("ramnagar", "KNR", "500456");
			Date date1= new Date("12/02/2020");
			Account account = new Account(1234, "madhu", 15000.0,date1, currentAddress);
			account.setAcName("madhu p");
			account.setAddress(currentAddress);
			System.out.println(account);
			
			Address address2 = new Address("vengalrao nagar", "Hyd", "500038");
			Account account2 = new Account(1235, "balaji", 12000.0, new Date("12/04/2010"), address2);
			System.out.println(account2);
			
			//bsrikanth765@gmail.com, balajigvidvaan@gmail.com, madhub8088@gmail.com, ravicreateiq@gmail.com
		}

	}


