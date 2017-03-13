/**
* (Sides of a Right Triangle) An application that reads three nonzero integers and determines and
* prints whether they could represent the sides of a right triangle.
*/


 import java.util.*;


 public class rightTriangle {
 	public static void main(String[] args) {
		
		boolean flag = false; 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.printf("Enter first side : ");
 		int side1 = input.nextInt();
 		System.out.printf("Enter second side : ");
 		int side2 = input.nextInt();
 		System.out.printf("Enter third side : ");
 		int side3 = input.nextInt();
 
 		// Check if sides are NON-zero		
 		if((side1>0&&side2>0)&&(side3>0)) 
 		{
			// Check if side of a triangle
 			if(((side1 + side2) > side3&&(side2 + side3) > side1)&&(side1 + side3) > side2) 
 			{ 
 				flag = rightTraingle(side1,side2,side3);
 			}
		}
		
 		
 		if(flag == false)
 			System.out.println("NOT a Side of a Right triangle");
 		else	
 			System.out.println("Side of a Right triangle");

 	}
 
 public static boolean rightTraingle(int s1, int s2, int s3) {
 	
 	boolean flag;
 	double a = Math.pow(s1,2);
 	double b = Math.pow(s2,2);
 	double c = Math.pow(s3,2);

	if((a + b) == c) 
		flag = true;
	else if((a + c) == b)
		flag = true;
	else if((c + b) == a)
		flag = true;
	else 
		flag = false;
	
	return flag;
  }
}
