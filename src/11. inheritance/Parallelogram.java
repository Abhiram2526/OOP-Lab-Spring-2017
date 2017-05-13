/**
* Parallelogram Class
*/

public class Parallelogram extends Quadrilateral {
	protected double base = bottomSide;
	protected double height;
	protected double sumOfSides = (bottomSide + topSide)/2;

	/* Param Constructor */
	public Parallelogram(Point corner1, Point corner2, Point corner3, Point corner4, Point heightCord1, Point heightCord2) {
		super(corner1, corner2, corner3, corner4);
		this.heightCord1 = new Point(heightCord1.getX(), heightCord1.getY());
		this.heightCord2 = new Point(heightCord2.getX(), heightCord2.getY());
	}

	/* Convert Points to Sides */
	public void convertToSide() {
		super.convertToSide();
        height = Math.sqrt(Math.pow(heightCord2.getX() - heightCord1.getX(), 2) + 
            Math.pow(heightCord2.getY() - heightCord1.getY(), 2));
	}

	/* Find the Area */
	public double area() {
		return bottomSide*height;			
	}


}