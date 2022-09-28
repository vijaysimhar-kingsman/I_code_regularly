package AtmProgramThroughMultiThreading;

//import AtmProgramThroughMultiThreading.Account;

class AccountHolder implements Runnable{

	Account account;
	
	public AccountHolder(Account acc) {
		account =acc;
	}
	@Override
	public void run() {
		for(int i =0;i<4;i++) {
			canWithdraw(1000);
			if(account.getBalance() <0) {
				System.out.println(" money is overdrawn");
			}
		}
	}
	
	private synchronized void canWithdraw(int amount) {
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName()+" is trying to withdraw ");
			try {
				Thread.sleep(1);
			}catch(Exception e) {}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" withdrawn successfully balance amount : "+account.getBalance());

		}else {
			System.out.println(Thread.currentThread().getName()+" falied to withdraw");

		}
	}
	

}
