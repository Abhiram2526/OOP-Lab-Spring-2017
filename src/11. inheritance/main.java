/**
* Main.java to Test the hierarchy
*/

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		/* Enter the Coordinates */
		System.out.print("X-coordinate of Corner 1 : ");
		double xOfCorner1 = input.nextDouble();
		System.out.print("Y-coordinate of Corner 1 : ");
		double yOfCorner1 = input.nextDouble(); 
		Point P1 = new Point(xOfCorner1,yOfCorner1);

		System.out.print("X-coordinate of Corner 2 : ");
		double xOfCorner2 = input.nextDouble();
		System.out.print("Y-coordinate of Corner 2 : ");
		double yOfCorner2 = input.nextDouble(); 
		Point P2 = new Point(xOfCorner2,yOfCorner2);

		System.out.print("X-coordinate of Corner 3 : ");
		double xOfCorner3 = input.nextDouble();
		System.out.print("Y-coordinate of Corner 3 : ");
		double yOfCorner3 = input.nextDouble(); 
		Point P3 = new Point(xOfCorner3,yOfCorner3);

		System.out.print("X-coordinate of Corner 4 : ");
		double xOfCorner4 = input.nextDouble();
		System.out.print("Y-coordinate of Corner 4 : ");
		double yOfCorner4 = input.nextDouble(); 
		Point P4 = new Point(xOfCorner4,yOfCorner4);

	}
}
