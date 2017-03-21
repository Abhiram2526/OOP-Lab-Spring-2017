/**
* An application that inputs one number consisting of five digits from the user,
* separates the number into its individual digits and prints the digits separated
* from one another by three spaces each. For example, if the user types in the number 42339,
* the program should print 4 2 3 3 9
*/

 import java.util.Scanner;

 public class digit {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter a five digit Number.\n>> ");
 		int a = input.nextInt();
 		int[] temp = new int[5];
 		int i = 0;

 		while(a!=0)
 		{
 			temp[i] = a%10;
 			a = a/10;
 			i++;
 		}

 		for(i=4;i>=0;i--)
 			System.out.print(" " + temp[i]);
 		System.out.printf("%n");
 	}
 }