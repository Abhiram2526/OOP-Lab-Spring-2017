/** 
* (Hypotenuse Calculations) A method hypotenuse that calculates the hypotenuse
* of a right triangle when the lengths of the other two sides are given. The method
* takes two arguments of type double and return the hypotenuse as a double .
* Incorporating this method into an application that reads values for side1 and side2
* and performs the calculation with the hypotenuse method. Using Math methods pow and
* sqrt to determine the length of the hypotenuse for each of the triangles in - 
* ----------------------------
* | Traingle | Side1 | Side2 |
* |	1		 |	3.0	 |	4.0	 | 	
* |	2		 |	5.0	 |	12.0 |
* |	3		 |	8.0	 |	15.0 |
* ----------------------------
*/

 public class hypotenuse {
 	public static void main(String[] args) {

 		System.out.println("Hypotenuse of Traingle 1 is " +
 			calHypotenuse(3.0, 4.0));
 		System.out.println("Hypotenuse of Traingle 2 is " +
 			calHypotenuse(5.0, 12.0));
 		System.out.println("Hypotenuse of Traingle 3 is " +
 			calHypotenuse(8.0, 15.0));

 	}

 	/* A methord calHypotenuse to calculate the Hypotenuse */
 	public static double calHypotenuse(double side1, double side2) {
 		return(Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2)));
 	}
 }