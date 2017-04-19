/**
* (Using the Enhanced for Statement) Write an application that uses an enhanced for statement to sum the double values passed by the
* command-line arguments. [Hint: Use the static method parseDouble of class Double to convert a String to a double value.]
*/

  
 public class Enhanced {
	public static void main(String args[]) {

		double sum = 0.0;
		if(args.length<1) {
			System.out.println("Error !!!");		
		}
		else {
			for(int i = 0; i<args.length; i++) {
				sum += Double.parseDouble(args[i]);
			}
			System.out.println("Sum : " + sum);
		}

	}
}
