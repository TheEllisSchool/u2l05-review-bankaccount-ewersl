
public class Bank {

	public static void main(String[] args) {
		// create an instance of a BankAccount 
		BankAccount ericasAccount = new BankAccount ("Erica Davis", 500, 150); 
		
		//deposit a check 
		ericasAccount.deposit(); 
		//withdraw
		ericasAccount.withdraw ();  
		
		//display the balance (uses toString method)
		System.out.println(ericasAccount); 

	}										

}
