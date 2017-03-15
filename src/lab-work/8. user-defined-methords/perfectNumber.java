/**
* (Perfect Numbers) An integer number is said to be a perfect number if its factors, including 1 (but not the number itself), 
* sum to the number. For example, 6 is a perfect number, because 6 = 1 + 2 + 3. A method isPerfect that determines 
* whether parameter number is a perfect number. Using this method in an application that displays all the perfect numbers
* between 1 and 1000. Also displaing the factors of each perfect number to confirm that the number is indeed perfect.
*/

 public class perfectNumber {
 	public static void main(String[] args) {

 		boolean isPerfect = false;
 		for(int number = 6; number<=1000; number++) {
 			
 			isPerfect = isPerfect(number);

 			if(isPerfect==true) {
 				System.out.printf(number + " is a Perfect Number having factors : ");
 				for(int temp=1; temp<number; temp++) {									// Prints Factors
 					if(number%temp==0)
	 					System.out.printf(" %d", temp);
 				}
 				System.out.println();
 			}
 		}
 	}

 	public static boolean isPerfect(int number) {
 		int sum = 0;

 		for(int counter=1; counter<number; counter++) {
 			if(number%counter==0)
 				sum += counter;
 				
 		}
 		if(sum == number)
 			return true;
 		else
 			return false;

 	}
 }