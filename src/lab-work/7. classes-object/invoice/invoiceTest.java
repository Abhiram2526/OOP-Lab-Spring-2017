/**
* A test app named InvoiceTest that demonstrates class Invoice ’s capabilities. 
*/

 import java.util.Scanner;

 public class invoiceTest {
 	public static void main(String[] args) {

 		Scanner input = new Scanner(System.in);

 		System.out.printf("Part Number: ");
 		String partNumber = input.next();			
 		System.out.printf("Part Description: ");
 		String partDescription = input.next();
 		System.out.printf("Quantity: ");
 		int totalItem = input.nextInt();
 		System.out.printf("Price: ");
 		double price = input.nextDouble();

 		invoice invoice1 = new invoice(partNumber, partDescription, totalItem, price);

 		System.out.println("Total Invoice Amount : " + invoice1.getInvoiceAmount());

 	}
 }