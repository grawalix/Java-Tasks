package multithreading;

public class Customer {

	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("amount going to withdraw");
	
	
	if(this.amount<amount)
	{
		System.out.println("less balance,please deposit");
		try {
			
      wait();
		}
      catch (Exception e) {
		// TODO: handle exception
    	  System.out.println("e");
	}
	}
	
	this.amount-=amount;
	System.out.println("withdraw complete");
   

}
	
	synchronized void deposit(int amount) {
		System.out.println("amount going to deposited");

		this.amount+=amount;
		System.out.println("amount deposited");
		notify();
	}
	
	
}


class Test{
	public static void main(String[] args) {
		final Customer c=new Customer();  
		new Thread(){  
		public void run(){c.withdraw(15000);}  
		}.start();  
		new Thread(){  
		public void run(){c.deposit(10000);}  
		}.start(); 
	}
}