/**
* An application that takes input of marks of 20 students.
* Counts its frequency and displays it in form of a bar chart (* = 1 student)
*/

 import java.security.SecureRandom;

 public class barChart {
 	public static void main(String[] args) {

 		SecureRandom randomNumber = new SecureRandom();
 		int frequency[] = new int[10];

 		for(int counter=0; counter<20; counter++) {
 			
 			int marks = randomNumber.nextInt(101);			// Generate marks from 0 to 100  
 			
 			// Storing the number of occurance of marks in frequency[]
 			int temp = marks/10;
 			if(temp!=10)
 				++frequency[temp];
 			else
 				++frequency[9];				// For 100 marks
 			
 		}

 		for(int i=0; i<10; i++) {

 			System.out.printf("\nMarks in %d-%d\t: ",i*10,i*10+10);
 			for(int j=0; j<frequency[i]; j++)
 				System.out.printf("*");
 		}
 		System.out.printf("\n");
 	}

}
