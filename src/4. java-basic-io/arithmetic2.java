/**
* Write an application that inputs three integers from the user and displays
* the sum, average, product, smallest and largest of the numbers.
*/

 import java.util.Scanner;

 public class arithmetic2 {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter three Numbers: \n");
 		int a = input.nextInt();
 		int b = input.nextInt();
 		int c = input.nextInt();

 		System.out.println("Sum: " + (a+b+c) + "\t\tAverage: " + 
 			((a+b+c)/3) + "\tProduct: " + (a*b*c) );

 		if(a>b&&a>c)
 		{
 			System.out.println("Largest: " + a);
 			if(b>c)
 				System.out.print("Smallest: " + c);
 			else
 				System.out.println("Smallest: " + b);
 		}
 		else if(b>a&&b>c)
 		{
 			System.out.println("Largest: " + b);
 			if(a>c)
 				System.out.println("Smallest: " +c);
 			else
 				System.out.println("Smallest: " +a);
 		}
 		else
 		{
 			System.out.println("Largest: " + c);
 			if(a>b)
 				System.out.println("Smallest: " + b);
 			else
 				System.out.println("Smallest: " + a);
 		}

 		}
 }