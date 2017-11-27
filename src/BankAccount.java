import javax.swing.JOptionPane;

public class BankAccount {
	// attributes 
	private String accountHolder;
	private int currentBalance;
	private int lowestBalance; 
	
	//methods 
	public void deposit () {
		String input1= JOptionPane.showInputDialog("What would you like to deposit"); 
		double amount= Double.parseDouble (input1); 
		currentBalance += amount; 
	}
	
	 public void withdraw () {
		String input2= JOptionPane.showInputDialog("What would you like to withdraw"); 
		double amount= Double.parseDouble (input2); 
		if (currentBalance- amount < lowestBalance) {
			String input3 = JOptionPane.showInputDialog("Are you sure you want to go below your lowest balance? (answer y or n)" );
				if (input3.equals("y"));
				currentBalance -= amount; 	
		} else { 
			currentBalance -= amount; 	
		}
	}
	public BankAccount (String hn, int cb, int lb) { 
		accountHolder= hn; 
		currentBalance= cb; 
		lowestBalance= lb; 
	}
	 //setters
	public void setLowest (int lb) {
		if (lb < 0) {
			System.out.println ("Balance not possible");
		}
		else {
			return; 
		}
	}
	private void currentBalance (int cb) { 
		return; 
	}
	
	//getters 
	public String getaccountHolder () {
		return accountHolder;
	}
	private int getcurrentBalance () {
		return currentBalance;  
	}
	public int getlowestBalance () {
		return lowestBalance; 
	}
	public String toString () {
		String info = accountHolder + "'s" + " bank account holds " + currentBalance + " with a lowest balance allowable of " + lowestBalance;  
		return info; 
	}
}
		

