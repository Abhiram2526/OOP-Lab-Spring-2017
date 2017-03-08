/**
* Find the Two Largest Numbers) Find the two largest values of the 10 values entered.
*/

 import java.util.Scanner;

 public class largestTwoNumbers {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);
 		int largest = 0;
 		int secondLargest = 0;

 		for(int i=0;i<10;i++) {
 			System.out.printf("Enter Number %d: ", i+1);
 			int number = input.nextInt();

 			if(number>secondLargest)
 				secondLargest = number;
 			else if
 		}
 	}
 }