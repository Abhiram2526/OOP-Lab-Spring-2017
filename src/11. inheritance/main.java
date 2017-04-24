/**
* Main.java to Test the hierarchy
*/

public class main {
	public static void main(String[] args) {
		Point P1 = new Point(0,0);
		Point P2 = new Point(0,4);
		Point P3 = new Point(4,0);
		Point P4 = new Point(4,4);
		Rectangle R1 = new Rectangle(P1, P2, P3, P4);
		R1.convertToSide();
		System.out.println("Area : " + R1.area());
	}
}