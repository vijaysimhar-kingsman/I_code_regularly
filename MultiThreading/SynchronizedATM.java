package MultiThreading;

class ATM{
	synchronized public void checkBalance(String Name) {
		System.out.print(Name);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		System.out.println(" has checked their balance");
	}
	synchronized public void withdraw(String Name , int amount ) {
		System.out.print(Name + " withdrawing ");
		try {
			Thread.sleep(100);
		}catch(Exception e) {
			
		}
		System.out.println(amount +" of cash from the ATM");
	}
}
class Customer extends Thread{
	ATM atm;
	String name;
	int amt;
	public  Customer(ATM atm,String name ,int amt) {
		this.atm=atm;
		this.name = name;
		this.amt= amt;
	}public void run() {
		useATM();
	}
	public void useATM( ) {
		atm.checkBalance(name);
		atm.withdraw(name, amt);
	}
}
public class SynchronizedATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm= new ATM();
		Customer customer1 = new Customer(atm,"vijay",10000);
		Customer customer2 = new Customer(atm,"sanjay",212);
		Customer customer3 = new Customer(atm,"jay",1020);
		Customer customer4 = new Customer(atm,"ajay",22);
		Customer customer5 = new Customer(atm,"vikram",2000);
		Customer customer6 = new Customer(atm,"akram",209);
		customer1.start();
		customer2.start();
		
		customer3.start();
		customer4.start();
		customer5.start();
		customer6.start();
	}

}
