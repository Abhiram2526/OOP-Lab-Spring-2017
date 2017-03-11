/**
* Write an application that reads an integer and determines and prints whether it’s odd or even.
*/

 import java.util.Scanner;

 public class evenOdd {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter an Integer to check whether it is even or odd.\n>> ");
 		int x = input.nextInt();

 		String s = (x%2==0)?"Even":"Odd";
 		System.out.println("The number is " + s);	
 	}
 }