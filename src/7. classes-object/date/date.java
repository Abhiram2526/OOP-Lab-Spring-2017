/**
* (Date Class) A class called Date that includes three instance variables—a month (type int),
* a day (type int ) and a year (type int ). It also has a constructor that initializes the three
* instance variables and assumes that the values provided are correct. Also a set and a
* get method for each instance variable. Provide a method displayDate that displays the month,
* day and year separated by forward slashes ( / ).
*/

 public class date {

 	private int month;
 	private int day;
 	private int year;

 	// constructor
 	public date(int month, int day, int year) {
 		if(month>0 && month<=12)
 			this.month = month;
 		
 		switch(month) {										// day according to respective month
 			case 1 :										// for months having 31 days
 			case 3 :
 			case 5 :
 			case 7 :
 			case 8 :
 			case 10 :
 			case 12 :
 				if(day>0 && day<=31)
 					this.day = day;
 				break;
 			case 2 :										// for february
 				if(day>0 && day<=28)
 					this.day = day;
 				break;
 			default :										// for other months
 				if(day>0 && day<=30)
 					this.day =day;
 				break;	
 		}
 		if(year>0)
 			this.year = year;
 	}

 	// set-methords
 	public void setMonth(int month) {
 		if(month>0 && month<=12)
 			this.month = month;
 	}
 	public void setDay(int day) {
 		switch(month) {
 			case 1 :
 			case 3 :
 			case 5 :
 			case 7 :
 			case 8 :
 			case 10 :
 			case 12 :
 				if(day>0 && day<=31)
 					this.day = day;
 				break;
 			case 2 :
 				if(day>0 && day<=28)
 					this.day = day;
 				break;
 			default :
 				if(day>0 && day<=30)
 					this.day =day;
 				break;	
 		}
 	}
 	public void setYear(int year) {
 		if(year>0)
 			this.year = year;
 	}

 	// get-methords 
 	public int getMonth() {
 		return month;
 	}
 	public int getDay() {
 		return day;
 	}
 	public int getYear() {
 		return year;
 	}

 	// display-date methord
 	public void displayDate() {
 		System.out.println("Date: " + month + "/" + day + "/" + year);
 	}
 }