/**
* A Java Program to test out the Arithmetic Operators in Java. (+, -, * ,/, %)
*/

 import java.util.Scanner;

 public class arithmetic {
 	public static void main(String[] args) {
 		
 		Scanner scanner = new Scanner(System.in);
 		
 		float SUM, DIFF;
 		
 		System.out.print("Enter first value: ");
 		float a = scanner.nextInt();
 		
 		System.out.print("Enter first value: ");
 		float b = scanner.nextInt();
 		
 		SUM = a + b;
 		DIFF = a - b;
 		
 
 		System.out.println("Sum: " + SUM + "\tDifference: " +
 			DIFF + "\nMultiplication: " + (a*b) + "\tDivision(b/a): "  
 			+ (b/a) + "\tModulus: " + (a%b) );
 		
 		}
 	}
