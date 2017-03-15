/**
* (Circle Area) An application that prompts the user for the radius of a circle and uses a method called circleArea to 
* calculate the area of the circle.
*/

 import java.util.Scanner;

 public class circleArea {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.printf("Enter the Radius : ");		// prompt
 		double radius = input.nextDouble();
 		System.out.printf("Area of the Circle have radius %.2f is %.2f\n", radius, circleArea(radius));

 	}

 	public static double circleArea(double radius) {
 		return (Math.pow(radius,2)*Math.PI);
 	}
 }