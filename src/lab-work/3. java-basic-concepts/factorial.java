/**
* An application that calculates the factorials of 1 through 20. Use type long .
* Display the results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
*/

 public class factorial {
 	public static void main(String[] args) {

 		long factorial;
 		int i=1,n;

 		while(i<=20)
 		{
 			n = i;
 			factorial = 1;
 			while(n<=i&&n>0)
 				{
 					factorial *= n;
 					n--;
 				}
 			System.out.println("Factorial of " + i + 
 				"\tis " + factorial);	
 			i++;
 		}

 	}
 }