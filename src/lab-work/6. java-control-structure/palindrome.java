/**
* An application that reads in a five-digit integer and determines whether it’s a palindrome.
* If the number is not five digits long, display an error message and allow the user to enter a new value.
*/

 import java.util.Scanner;

 public class palindrome {

 	static int revNumber = 0;
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);
 		
 		while(true) {
 			System.out.print("Enter a five-digit integer : ");
 			int number = input.nextInt();

 			reverseNumber(number);

 			if(number==revNumber) {
	 			System.out.println("\nIt's a palindrome");
	 			break;	
 			}
  			else {
 				System.out.println("\nERROR!!! It's NOT a palindrome. Please enter a new value.");
 				System.out.println("PRESS 1 TO CONTINUE (2 TO STOP)");
 				int x = input.nextInt();
 				if(x == 2) 
 					break;
  			}
 			
 		}
 		
 	}

 	public static int reverseNumber(int newNumber) {
  			int temp;
 			while(newNumber>0) {
 			temp = newNumber%10;
 			revNumber = revNumber*10 + temp;
 			newNumber /= 10;
 		}
 		System.out.print("Reversed Number : " + revNumber);
  		return revNumber;
 	}

 }