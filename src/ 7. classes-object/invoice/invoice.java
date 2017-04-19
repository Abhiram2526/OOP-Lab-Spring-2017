/**
* (Invoice Class) A class called Invoice that a hardware store might use to represent an invoice
* for an item sold at the store. An Invoice should include four pieces of information as instance
* variables—a part number (type String ), a part description (type String ), a quantity of the 
* item being purchased (type int ) and a price per item ( double ). Your class should have a
* constructor that initializes the four instance variables. Provide a set and a get method for
* each instance variable. In addition, provide a method named getInvoiceAmount that calculates
* the invoice amount (i.e., multiplies the quantity by the price per item), then returns the
* amount as a double value. If the quantity is not positive, it should be set to 0 . If the
* price per item is not positive, it should be set to 0.0 . 
*/

 public class invoice {

 	private String partNumber;
 	private String partDescription;
 	private int totalItem;
 	private double price;

 	// constructor to initialize
 	public invoice(String partNumber, String partDescription, int totalItem, double price) {
 		this.partNumber = partNumber;
 		this.partDescription = partDescription;
 		if(totalItem > 0)
 			this.totalItem = totalItem;
 		if(price > 0.0)
 			this.price = price;
 	}

 	// set-methords
 	public void setPartNumber(String partNumber) {
 		this.partNumber = partNumber;
 	}
 	public void setPartDescription(String partDescription) {
 		this.partDescription = partDescription;
 	}
 	public void setTotalItem(int totalItem) {
 		if(totalItem > 0)
 			this.totalItem = totalItem;
 	}
 	public void setPrice(double price) {
 		if(price > 0.0) 
 			this.price = price;
 	}

 	// get-methords
 	public String getPartNumber() {
 		return partNumber;
 	}
 	public String getPartDescription() {
 		return partDescription;
 	}
 	public int getTotalItem() {
 		return totalItem;
 	}
 	public double getPrice() {
 		return price;
 	}

 	// getInvoiceAmount() methord to return the invoice amount
 	public double getInvoiceAmount() {
 		return(totalItem*price);
 	}
 }