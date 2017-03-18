/**
* (Multiples) A method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of 
* the first. The method takes two integer arguments and return true if the second is a multiple of the first and false 
* otherwise. Incorporating this method into an application that inputs a series of pairs of integers (one pair at a time) and 
* determines whether the second value in each pair is a multiple of the first.
*/

 import java.util.Scanner;

 public class Multiples {
 	public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	boolean flag;									// boolean flag is by Default 'false'

 	System.out.printf("Enter first number of the series : ");
 	int number1 = input.nextInt();
 	System.out.printf("Enter second number of the series : ");
 	int number2 = input.nextInt(); 

 	flag = isMultiple(number1, number2);

 	if(flag == true)
	 	System.out.println("Second Number is a multiple of the first. ");
	else
		System.out.println("Second Number is NOT a multiple of the first. ");
 	}

 	public static boolean isMultiple(int number1, int number2) {
 		if(number2%number1==0)
 			return true;
 		else
 			return false;
 	}

 }