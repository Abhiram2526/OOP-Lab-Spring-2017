/**
* An application that asks the user to enter two integers, 
* obtains them from the user and displays the larger number followed by the words "is larger".
* If the numbers are equal, print the message "These numbers are equal".
*/

 import java.util.Scanner;

 public class comparingNumbers {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter the first Integer: ");
 		int a = input.nextInt();
 		System.out.print("Enter the second Integer: ");
 		int b = input.nextInt();

 		System.out.printf("%n");

 		if(a>b)
 			System.out.printf("First Integer i.e. %d is larger.\n",a);
 		else if(b>a)
 			System.out.printf("Second Integer i.e. %d is larger.\n",b);
 		else
 			System.out.printf("These numbers are equal.\n");

 	}
 }