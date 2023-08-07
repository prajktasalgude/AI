package entities;

public class Bank {

		private String accountNumber;
		private String holderName;
		private String ifsc;
		private String bankName;
		private int balance;
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getHolderName() {
			return holderName;
		}
		public void setHolderName(String holderName) {
			this.holderName = holderName;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		@Override
		public String toString() {
			return "Bank [accountNumber=" + accountNumber + ", holderName=" + holderName + ", ifsc=" + ifsc
					+ ", bankName=" + bankName + ", balance=" + balance + "]";
		}
		
}
