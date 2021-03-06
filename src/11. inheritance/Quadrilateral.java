/**
* (Quadrilateral Inheritance Hierarchy) Write an inheritance hierarchy for classes
* Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
* Use Quadrilateral as the superclass of the hierarchy.
* Create and use a Point class to represent the points in each shape.
* Make the hierarchy as deep (i.e., as many levels) as possible.
* Specify the instance variables and methods for each class.
* The private instance variables of Quadrilateral should be the x-y coordinate pairs
* for the four endpoints of the Quadrilateral.
* Write a program that instantiates objects of your classes and outputs each object’s
* area (except Quadrilateral).
*/


public class Quadrilateral {
	/* Instance Variables Of Type Point Class */
	private Point corner1;
	private Point corner2;
	private Point corner3;
	private Point corner4;
	protected double topSide;
	protected double bottomSide;
	protected double leftSide;
	protected double rightSide;

	/* Coordinates of height */
	protected Point heightCord1;
	protected Point heightCord2;


	/* Default Constructor which initiallizes to (0,0), (0,1), (1,1), (1,0) */
	public Quadrilateral() {
		corner1 = new Point();
		corner2 = new Point(0,1);
		corner3 = new Point(1,1);
		corner4 = new Point(1,0);
		heightCord1 = new Point(0,0);
		heightCord2 = new Point(0,1);
	}

	/* Param Constructor */
	public Quadrilateral(Point corner1, Point corner2, Point corner3, Point corner4) {
		this.corner1 = new Point(corner1.getX(), corner1.getY());
		this.corner2 = new Point(corner2.getX(), corner2.getY());
		this.corner3 = new Point(corner3.getX(), corner3.getY());
		this.corner4 = new Point(corner4.getX(), corner4.getY());
	}

	/* getPoint method to return a point (1-4) */
	public Point getPoint(int vertexNumber) {
		// Switch to choose and return the required vertex
		switch(vertexNumber) {
			case 1 :
				// Return X and Y coordinate of Corner1 which of an Point Class Object
				return (new Point(corner1.getX(), corner1.getY())); 
			case 2 :
				// Return X and Y coordinate of Corner2 which of an Point Class Object
				return (new Point(corner2.getX(), corner2.getY()));
			case 3 :
				// Return X and Y coordinate of Corner1 which of an Point Class Object
				return (new Point(corner3.getX(), corner3.getY()));
			default :
				// Return X and Y coordinate of Corner1 which of an Point Class Object
				return (new Point(corner4.getX(), corner4.getY()));
		}
	}

	/* setPoint method to set a point (1-4) */
	public void setPoint(int vertexNumber, Point newPoint) {
		// Switch to choose and set the required vertex
		switch(vertexNumber) 
		{
			case 1 :
				// Set the value of corner1 to (X,Y) of the newPoint argument of Point Class
				corner1 = new Point(newPoint.getX(), newPoint.getY());
				break;
			case 2 :
				// Set the value of corner2 to (X,Y) of the newPoint argument of Point Class
				corner2 = new Point(newPoint.getX(), newPoint.getY());
				break;
			case 3 :
				// Set the value of corner3 to (X,Y) of the newPoint argument of Point Class
				corner3 = new Point(newPoint.getX(), newPoint.getY());
				break;
			default :
				// Set the value of corner4 to (X,Y) of the newPoint argument of Point Class
				corner4 = new Point(newPoint.getX(), newPoint.getY());
				break;
		}
	}


	/* Convert Points to Sides */
	public void convertToSide() {
        topSide = Math.sqrt(Math.pow(corner2.getX() - corner3.getX(), 2) + 
            Math.pow(corner2.getY() - corner3.getY(), 2));
        
        rightSide = Math.sqrt(Math.pow(corner3.getX() - corner4.getX(), 2) + 
            Math.pow(corner3.getY() - corner4.getY(), 2));
        
        bottomSide = Math.sqrt(Math.pow(corner4.getX() - corner1.getX(), 2) + 
            Math.pow(corner4.getY() - corner1.getY(), 2));
        
        leftSide = Math.sqrt(Math.pow(corner2.getX() - corner1.getX(), 2) + 
            Math.pow(corner2.getY() - corner1.getY(), 2));
	}

	/* Find the Area */
	public double area() {
		return topSide*rightSide;			
	}

}