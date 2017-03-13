/**
* A test app named dateTest that demonstrates class Date ’s capabilities.
*/

 import java.util.Scanner;


 public class dateTest {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.printf("Month : ");
 		int month = input.nextInt();
 		System.out.printf("Day : ");
 		int day = input.nextInt();
 		System.out.printf("Year : ");
 		int year = input.nextInt();

 		// Creating new object of class date
 		date newDate = new date(month,day,year);

 		System.out.println("\n");
 		System.out.println("Month: " + newDate.getMonth());
 		System.out.println("Day: " + newDate.getDay());
 		System.out.println("Year: " + newDate.getYear());
 		newDate.displayDate();
 	}
 }