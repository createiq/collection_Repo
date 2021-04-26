package inheritance;

import java.util.Date;

public class Account {

		private int acNO;
		private String acName;
		private double acBalance;
		private Date accountCreationDate;
		private Address address;
		private Address peraddress;
 
		public Account() {
			// TODO Auto-generated constructor stub
		}

		 
		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		public Account(int acNO, String acName, double acBalance, Date accountCreationDate, Address address) {
			super();
			this.acNO = acNO;
			this.acName = acName;
			this.acBalance = acBalance;
			this.accountCreationDate = accountCreationDate;
			this.address = address;
		}


		public int getAcNO() {
			return acNO;
		}

		public void setAcNO(int acNO) {
			this.acNO = acNO;
		}

		public String getAcName() {
			return acName;
		}

		public void setAcName(String acName) {
			this.acName = acName;
		}

		public double getAcBalance() {
			return acBalance;
		}

		public void setAcBalance(double acBalance) {
			this.acBalance = acBalance;
		}

		public Date getAccountCreationDate() {
			return accountCreationDate;
		}

		public void setAccountCreationDate(Date accountCreationDate) {
			this.accountCreationDate = accountCreationDate;
		}


		@Override
		public String toString() {
			return "Account [acNO=" + acNO + ", acName=" + acName + ", acBalance=" + acBalance + ", accountCreationDate="
					+ accountCreationDate + ", address=" + address + "]";
		}
	

}
	


