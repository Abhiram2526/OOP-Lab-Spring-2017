/**
* (Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set of three integer values for the lengths of
* the sides of a right triangle is called a Pythagorean triple. The lengths of the three sides must satisfy the relationship that the sum of
* the squares of two of the sides is equal to the square of the hypotenuse. Write an application that displays a table of the Pythagorean
* triples for side1 , side2 and the hypotenuse , all no larger than 500. Use a triple-nested for loop that tries all possibilities. This
* method is an example of “brute-force” computing.
*/

 import java.util.Scanner;
 
 public class pTriplets {
 	public static void main(String[] args) {
 		
 		Scanner input = new Scanner(System.in);
 		
 		boolean flag = false;
 		System.out.printf("Enter first side : ");
 		int a = input.nextInt();
 		System.out.printf("Enter second side : ");
 		int b = input.nextInt();
 		System.out.printf("Enter third side : ");
 		int c = input.nextInt();
 
		 
 		// Check if sides are NON-zero		
 		if((a>0&&b>0)&&(c>0)) 
 		{
			// Check if side of a triangle
 			if(((a + b) > c&&(b + c) > a)&&(a + c) > b) 
 			{ 
 				// Check if right triangle
 				if((a*a + b*b) == c*c) 
					flag = true;
				else if((a*a + c*c) == b*b)
					flag = true;
				else if((c*c + b*b) == a*a)
					flag = true;
				else 
					flag = false;
 			}
		}
		
 		
 		if(flag == false)
 			System.out.println("NOT a Side of a Right triangle");
 		else	
 			System.out.println("Side of a Right triangle");
 			
 		}
 }

 		
