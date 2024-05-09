package sk.pre.java.bank;

public class Bank {

	private Account[] accounts;

	public Bank() {
		accounts = new Account[100];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.openBank();
	}

	public void openBank() {
		
		accounts[0] = new Account("1234","kim",1000);
		this.printAccountList();
		// 업무 서술되어야 한다.(프로세스가 온다)
		/*
		 * while(true) { // 사용자 인터페이스(System.in) // if(업무시간이 끝나면) { break; } }
		 */
	}

	public void createAccount() {

	}

	public void deposit(int amount) {

	}

	public void withdraw(int amount) {

	}

	public void printAccountList() {
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i]);
			}
		}
	}

}
