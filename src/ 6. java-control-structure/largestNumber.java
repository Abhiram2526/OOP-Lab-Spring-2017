/**
* A Java application that inputs a series of 10 integers and determines and prints the largest integer.
*/

 import java.util.Scanner;

 public class largestNumber {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter Number 1: ");
 		int largest = input.nextInt();
 		
 		for(int i=1;i<10;i++) {
 			System.out.printf("Enter Number %d: ", i+1);
 			int number = input.nextInt();

 			if(number>largest) 
 				largest = number;
 		}

 		System.out.println("\nLargest: " + largest);
 	}
 }