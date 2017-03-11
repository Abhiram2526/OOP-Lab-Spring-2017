/**
* Write an application that inputs from the user the radius of a circle as an integer
* and prints the circle’s diameter, circumference and area using the floating-point 
* value 3.14159 for π. [Note: You may also use the predefined constant Math.PI for the value of π.]
*/

 import java.util.Scanner;


 public class circle {
	public static final float Pi = 3.14159f;
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter the radius.\n>> ");
 		float radius = input.nextFloat();

 		System.out.println("Diameter: " + (2*radius) + 
 			"\nCircumference: " + (2*Pi*radius) + "\nArea: " +
 			(Pi*radius*radius));

 	}
 }