/**
* Create a Java Array to hold 10 values and display the maximum and minimum values.
*/

 import java.util.Scanner;

 public class array {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		int[] array = new int[10];

 		System.out.println("Enter 10 integers: ");
 		for(int i=0;i<array.length;i++) {
 			array[i] = input.nextInt();
 		}

 		int maximum=array[0],minimum=array[0];

 		for(int i=0;i<array.length;i++) {
 			
 				if(array[i]>maximum)
 					maximum = array[i];
 				 				
 				if(array[i]<minimum)
 					minimum = array[i];
 		}
 		System.out.println("Maximum: " + maximum + "\tMinimum: " + minimum);
 		

 	}
 }