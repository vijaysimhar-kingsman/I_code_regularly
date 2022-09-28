package AtmProgramThroughMultiThreading;

public class Account {
	private int balance =7000;
	public int getBalance() {
		return balance;
	}public void withdraw(int amount) {
		this.balance-=amount;
	}

}
