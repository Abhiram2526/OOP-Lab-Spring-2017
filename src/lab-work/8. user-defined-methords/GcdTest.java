/**
* (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
* integer that evenly divides each of the two numbers. A method gcd that returns the
* greatest common divisor of two integers. Incorporating the method into an application
* that reads two values from the user and displays the result.
*/

 import java.util.Scanner;

 public class GcdTest {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.printf("Number 1 : ");
 		int number1 = input.nextInt();
 		System.out.printf("Number 2 : ");
 		int number2 = input.nextInt();
 		int gcd; 

 		if(number1>number2)											// calling gcd() in the from of gcd(max,min)
 			gcd = gcd(number1,number2);
 		else
 			gcd = gcd(number2,number1);

 		System.out.printf("GCD of %d & %d is %d\n", number1, number2, gcd);

 	}

 	/* gcd methord to get the GCD */
 	public static int gcd(int number1, int number2) {
 		if(number1==0)
 			return number2;
 		else if(number2==0)
 			return number1;
 		else
 			return gcd(number2, number1%number2);
 	}
 }