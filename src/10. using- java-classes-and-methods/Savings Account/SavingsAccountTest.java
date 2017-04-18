/**
* Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
* with balance of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then calculate the monthly
* interest for each of 12 months and print the new balances for both savers. Next, set the annualInterestRate to 5%,
* calculate the next month's interest and print the new balances for both saver.
*/

public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		saver1.modifyInterestRate(0.04);
		saver2.modifyInterestRate(0.04);
		System.out.println("New Balance of Saver 1 : " + saver1.calculateMonthlyInterest());
		System.out.println("New Balance of Saver2 : " + saver2.calculateMonthlyInterest());
	
		saver1.modifyInterestRate(5);
		saver2.modifyInterestRate(5);
		System.out.println("New Balance of Saver 1 : " + saver1.calculateMonthlyInterest());
		System.out.println("New Balance of Saver2 : " + saver2.calculateMonthlyInterest());
	
	}
} 