/**
* An application to find the two largest values of the 10 values entered.
*/

 import java.util.Scanner;
 
 public class twoLargest {
 	public static void main(String[] args) {
 		
 		Scanner input = new Scanner(System.in);
 		
 		int num, largest = 0, secondLargest = 0, i=1 ;
 		
 		while(i<=10) {
 			System.out.printf("Enter number %d : ",i);
 			num = input.nextInt();
 			
 			if(num>largest) {
 				secondLargest = largest;
 				largest = num;
 			}
 			i++;
 		}
 		
 		System.out.println("Largest : " + largest + 
 			"\tSecond Largest : " + secondLargest);
 		
	}
 }
