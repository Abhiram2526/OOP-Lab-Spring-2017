/**
* A method integerPower(base, exponent) that returns the value of base exponent.
* For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assuming that exponent
* is a positive, nonzero integer and that base is an integer. Using a for or while statement
* or recurssive function to control the calculation. Do not use any Math class methods. 
* Incorporating this method into an application that reads integer values for base and
* exponent and performs the calculation with the integerPower method.
*/

 import java.util.Scanner;

 public class BasePower {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.printf("Base: ");
 		int base = input.nextInt();
 		System.out.printf("Exponent: ");
 		int exponent = input.nextInt();

 		System.out.println("Base^Exponent: " + integerPower(base, exponent));
 	}

	/* Using a recursive function to return base^exponent */
 	public static int integerPower(int base, int exponent) {
 		if(exponent == 0)
 			return 1;
 		else
 			return base*integerPower(base,exponent-1);
 	}
 }