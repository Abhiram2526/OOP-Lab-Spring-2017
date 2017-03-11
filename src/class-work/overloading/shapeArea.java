/**
* A program to find the area of different shapes
* # UNDERSTANDING METHORD OVERLOADING
*/ 


 public class shapeArea {
 	public static void main(String[] args) {

 		System.out.println("Area of Rectangle : " + Area(4.0,3.0));
 		System.out.printf("Area of Circle : %.2f\n" , Area(4.0));
 	}

 public static double Area(double length, double breadth) {
 	return length*breadth;
 }

 public static double Area(double radius) {
 	return(Math.pow(radius,2)*Math.PI);
 }

}