/**
* A java program to delete duplicate elements from an array 
*/
 import java.util.Scanner;


 public class DupElimination {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		System.out.printf("Enter the size of the array : ");
		int size = input.nextInt();
		System.out.println("Enter the elements of the array");
	
		for(int i = 0; i < size; i++) {
			System.out.printf("Enter the element %d : ", i+1);
			array[i] = input.nextInt();
		}  

		for(int i = 0; i < size-1; i++) {
			for(int j = i+1; j < size-1; j++) {
				
					if(array[i]==array[j]) {			// Check for duplicates
					while(j < size-1)
					{
						array[j] = array[j+1]; 		// Shift the number
						j++; 
					}
					--size;
				}
			}		
		}

		System.out.println("Updated ARRAY with removed duplicate elements");
		for(int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
			
	}
 }
