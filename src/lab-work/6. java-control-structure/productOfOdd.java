/**
 * (Calculating the Product of Odd Integers) An application that calculates the product of the odd integers from 1 to 15.
 */


 import java.util.Scanner;
 
 public class productOfOdd {
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 int product = 1;
		 
		 for(int i=1; i<=15 ; i++) {
			 
			 if(i%2!=0)
				product *= i; 
		
		}
		
		System.out.println("Product of odd integers from 1 to 15 is " +
			product);
			
		}
 }
