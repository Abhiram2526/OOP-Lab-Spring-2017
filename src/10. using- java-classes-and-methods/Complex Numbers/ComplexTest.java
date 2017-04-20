/**
* ComplexTest.java to test Complex Class
*/

 import java.util.Scanner; 


 public class ComplexTest {
 	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);
 		Complex number1 = new Complex(4, 2);
 		Complex number2 = new Complex();
 		
 		number2.setComplexNumber(3, 2);
 		
 		/* Add the numbers */
 		number1.addRealPart(number1.getRealPart(), number2.getRealPart());
 		number1.addImaginaryPart(number1.getImaginaryPart(), number2.getImaginaryPart());	
 		
 		/* Subtract the numbers */
		number1.subtractRealPart(number1.getRealPart(), number2.getRealPart());
 		number1.subtractImaginaryPart(number1.getImaginaryPart(), number2.getImaginaryPart());
 		
 		/* Show the values */
 		number1.showComplex();
 		
 	}
 }
