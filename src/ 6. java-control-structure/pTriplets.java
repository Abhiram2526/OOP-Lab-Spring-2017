/**
* (Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of
* the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the relationship that the sum of
* the squares of two of the sides is equal to the square of the hypotenuse. Write an application that displays a table of the Pythagorean
* triples for side1 , side2 and the hypotenuse , all no larger than 500. Use a triple-nested for loop that tries all possibilities. This
* method is an example of “brute-force” computing.
*/

 
 public class pTriplets {
 	public static void main(String[] args) {
 		
 		for(int side1=1; side1<=500; side1++ ) {
 			for(int side2=1; side2<=500; side2++) {
 				for(int side3=1; side3<=500; side3++) {
 					if((side1*side1 + side2*side2)==(side3*side3))
 						if(side1<side2)
 							System.out.println(side1+" "+side2+" "+side3);
 				}
 			}
 			
 		}
 	}
}

 		
