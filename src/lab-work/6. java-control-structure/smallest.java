/**
* An application that finds the smallest of several integers. Assuming that the first value read specifies the
* number of values to input from the user.
*/

 import java.util.Scanner;
 
 public class smallest {
 	public static void main(String[] args) {
 	
 		Scanner input = new Scanner(System.in);
 		
 		System.out.printf("Enter number 1 : ");
 		int first = input.nextInt();
 		int minimum = first;
 		
 		for(int i=1 ; i<first ; i++) {
 			System.out.printf("Enter number %d : ",i+1);
 			int number = input.nextInt();
 			
 			if(minimum > number) {
 				minimum = number;
			}
		}
 		System.out.println("Minimum : " + minimum);
 		
	}
 }
 		
