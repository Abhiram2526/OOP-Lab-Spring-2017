/**
* (Rectangle Class) Create a class Rectange with attributes length and width, each of which defaults to 1.
* Provide methods that calculate the rectangle's perimeter and area. It has set and get  methods for both
* length and width. The set methods should verify that length and width are each floating point numbers larger
* than 0.0 and less than 20.0.
*/

public class Rectangle {
	/* Define the attributes to floating type */
	private double length;
	private double width; 

	/* Define default constructor to set default values to 1 */
	public Rectangle() {
		length = 1;
		width = 1; 
	}

	/* Define set Method to change the attributes */
	public void setAttributes(double length, double width) {
		if(length>0.0 && length<20.0)
			this.length = length;
		if(width>0.0 && width<20.0)
			this.width = width;
	}

	/* Define get Methords*/
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}

	/* Define method to calculate perimeter */
	public double calPerimeter() {
		return 2*(length + width);
	}

	/* Define method to calculate area */
	public double calArea() {
		return length*width;
	}

}