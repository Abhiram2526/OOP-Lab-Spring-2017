/**
* (Savings Account Class) Create class SavingsAccount. Use a static variable annualInterestRate to store the annual 
* interest rate for all account holders. Each object of the class contains a private instance variable savingsBalance
* indicating the amount the saver curently has on deposit. Provide method calculateMonthlyInterest to calculate the 
* monthly interest by multiplying the savingBalance by annualInterestRate divided by 12-this interest should be added to 
* savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
*/

 public class SavingsAccount {
 	private static double annualInterestRate;
 	private double savingsBalance;
 	
 	public SavingsAccount(double savingsBalance) {
 		if(savingsBalance>0.0)
 			this.savingsBalance = savingsBalance;
 	}

 	public double calculateMonthlyInterest() {
 		return (savingsBalance + (savingsBalance*annualInterestRate)/12);
 	} 

 	public static void modifyInterestRate(double annualInterestRate) {
 		SavingsAccount object = new SavingsAccount(0.0);
 		object.annualInterestRate = annualInterestRate;
 	}
 }