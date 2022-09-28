package AtmProgramThroughMultiThreading;

public class ATM {

	public static void main(String[] args) {
		
		Account acc = new Account();
		AccountHolder ah = new AccountHolder(acc);
		Thread  t1 = new Thread(ah);
		Thread t2 = new Thread(ah);
		Thread  t3 = new Thread(ah);
		Thread t4 = new Thread(ah);
		
		
		t1.setName("vijay");
		t2.setName("shivani");
		t3.setName("ajay");
		t4.setName("shinty");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
