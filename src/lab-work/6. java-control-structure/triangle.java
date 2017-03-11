/**
* Write an application that reads three nonzero values entered by the user and determines and prints whether they could represent the sides
* of a triangle.
*/

 import java.util.Scanner;
 import java.io.*;
 
 public class triangle {
 	public static void main(String[] args) {
		
		boolean flag = false; 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.printf("Enter first side : ");
 		int side1 = input.nextInt();
 		System.out.printf("Enter second side : ");
 		int side2 = input.nextInt();
 		System.out.printf("Enter third side : ");
 		int side3 = input.nextInt();
 		
 		// Check if side of a triangle
 		if((side1 + side2) > side3)
 		{
			if((side2 + side3) > side1)
			{
				if((side1 + side3) > side2) 
				{
				flag = true;
				}
			}
		}
		
 		
 		if(flag == false)
 			System.out.println("NOT a Side of a triangle");
 		else	
 			System.out.println("Side of a triangle");

 	}
 }
