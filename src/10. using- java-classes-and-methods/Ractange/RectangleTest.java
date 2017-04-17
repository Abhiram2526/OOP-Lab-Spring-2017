/**
* (RectangleTest) A program to use the Rectangle Class
*/

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* Create an Object of Rectangle Class */
		Rectangle R1 = new Rectangle();

		/* Input Length and Width */
		System.out.printf("Length : ");
		double length = input.nextDouble();
		System.out.printf("Width : ");
		double width = input.nextDouble();		

		/* Use to object for various operation */
		R1.setAttributes(length, width);
		System.out.printf("Length : %.2f\tWidth : %.2f\n", R1.getLength(), R1.getWidth());
		System.out.printf("Perimeter : %.2f\tArea : %.2f\n", R1.calPerimeter(), R1.calArea());
 	}
}