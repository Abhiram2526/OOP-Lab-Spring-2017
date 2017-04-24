/**
* Point Class
*/

public class Point {
		/* Instance Variable Of Point Class i.e X-Y Cordinates */
		private double x;
		private double y;


		/* Default Constructor */
		public Point() {
			x = 0;
			y = 0;
		}

		/* Param Constructor */
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		/* Get Methods */
		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

}
