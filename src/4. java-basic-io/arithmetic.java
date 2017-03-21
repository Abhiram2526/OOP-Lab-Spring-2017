/**
* Write an application that asks the user to enter two integers,
* obtains them from the user and prints their sum, product, difference and quotient (division).
*/


 import java.util.Scanner;

 public class arithmetic {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter the first Integer: ");
 		float a = input.nextFloat();						// Taking float in place of int to display 
 		System.out.print("Enter the second Integer: ");		// Division in floating type
 		float b = input.nextFloat();

 		System.out.println("Sum: " + (int)(a+b) + 
 			"\t\tProduct: " + (int)(a*b) + "\nDifference: " +
 			(int)(a-b) + "\tDivision: " + (a/b));
 	}
 }