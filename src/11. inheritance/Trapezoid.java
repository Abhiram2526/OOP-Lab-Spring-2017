/**
* Trapezoid Class
*/

public class Trapezoid extends Parallelogram {
	
	/* Param Constructor */
	public Trapezoid(Point corner1, Point corner2, Point corner3, Point corner4, Point heightCord1, Point heightCord2) {
		super(corner1, corner2, corner3, corner4, heightCord1, heightCord2);
	}

	/* Find the Area */
	public double area() {
		return sumOfSides*height;			
	}
}