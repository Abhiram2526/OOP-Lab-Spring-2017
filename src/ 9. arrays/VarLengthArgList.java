/**
* (Variable-Length Argument List) Write an application that calculates the product of a series of integers that are passed to method product
* using a variable-length argument list. Test your method with several calls, each with a different number of arguments.
*/

 
 public class VarLengthArgList {
	public static void main(String args[]) {

		int product = 1;
		if(args.length<1) {
			System.out.println("Error !!!");		
		}
		else {
			for(int i = 0; i<args.length; i++) {
				product *= Integer.parseInt(args[i]);
			}
			System.out.println("Product : " + product);
		}

	}
}
