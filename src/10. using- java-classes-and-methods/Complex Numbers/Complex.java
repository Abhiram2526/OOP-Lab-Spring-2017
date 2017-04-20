/**
* (Complex Numbers) Create a class called Complex for performing arithmetic with complex numbers.
* Complex numbers has the form of realPart + imaginaryPart * i, where i is sqrt(-1).
* Use floating point variables to represent the private data of the class. Provide a constructor
* that enables an object of this class to be initialized when it's declared. Provide a no-argument
* constructor with default values in the case no initializers are provided.
* Provide public methords that perform the following operations:
* 1. Add two Complex numbers: The real parts are added together and the imaginary parts are added
* together.
* 2. Substract two Complex numbers. The real part of the right operand is subtracted from the
* real part of the left operand, and the imaginary part of the right operand is subtracted from 
* imaginary part of the left operand.
* 3. Print Complex numbers in the form (realPart, imaginaryPart).
*/

public class Complex {
	private float realPart;
	private float imaginaryPart;
	private float sumRealPart;
	private float sumImaginaryPart;
	private float subtractRealPart;
	private float subtractImaginaryPart;
	
	public Complex(float realPart, float imaginaryPart) {
		this.realPart = realPart;
	}
	
	public Complex() {
		realPart = 0.0f;
		imaginaryPart = 0.0f;
	}
	
	/* Set Method to set the values */
	public void setComplexNumber(float realPart, float imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	} 
	
	/* Get Methord to get the values */
	public float getRealPart() {
		return realPart;
	}
	
	public float getImaginaryPart() {
		return imaginaryPart;
	}
	
	public void addRealPart(float realPart1, float realPart2) {
		 sumRealPart = realPart1 + realPart2 ;
	}
	
	public void addImaginaryPart(float imaginaryPart1, float imaginaryPart2) {
		sumImaginaryPart = imaginaryPart1 + imaginaryPart2;
	}
	
	public void subtractRealPart(float realPart1, float realPart2) {
		subtractRealPart = realPart1 + realPart2 ;
	}
	
	public void subtractImaginaryPart(float imaginaryPart1, float imaginaryPart2) {
		subtractImaginaryPart = imaginaryPart1 + imaginaryPart2;
	} 
	
	public void showComplex() {
		System.out.printf("Sum : (%.2f, %.2f)\tSubtract : (%.2f, %.2f)\n",sumRealPart, sumImaginaryPart, subtractRealPart, subtractImaginaryPart);
	}
}
