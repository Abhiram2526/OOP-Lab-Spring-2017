/**
* (Variable-Length Argument List) Write an application that calculates the product of a series of integers that are passed to method product
* using a variable-length argument list. Test your method with several calls, each with a different number of arguments.
*/

 
public class VarLengthArgList {
	
 	public static void productOfArg(int ... arg) {
 		int product = 1;
 		for(int x : arg) {
 			product = product * x; 
 		}

 		System.out.println("Product of Arguments : " + product);
 	}

	public static void main(String args[]) {
		productOfArg( );
		productOfArg(1,2,3,4);

		int newArr[] = {12,13,14,15,16};
		productOfArg(newArr);
	}
}
