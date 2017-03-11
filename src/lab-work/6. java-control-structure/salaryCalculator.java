/**
* (Salary Calculator) A Java application that determines the gross pay for each of three employees. The company pays straight time 
* for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40. Given a list of the 
* employees, their number of hours worked last week and their hourly rates. This program inputs this information for each employee, 
* then determine and display the employee’s gross pay. 
*/

 import java.util.Scanner;
 
 public class salaryCalculator {
 	public static void main(String[] args) {
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.printf("Enter name of employee : ");
 		String name = input.next();
 		System.out.printf("Enter number of hours : ");
 		int hours = input.nextInt();
 		System.out.printf("Enter hourly rates : ");
 		double hourlyRate = input.nextDouble();
 		
 		System.out.println("Gross Pay of " + name + 
			" : " + grossPay(hours,hourlyRate));
	}
	
	public static double grossPay(int hours,double hourlyRate) {
		double grossPay;
		if(hours>40)
			grossPay = 40*hourlyRate + (hours-40)*(hourlyRate/2);
		else
			grossPay = hours*hourlyRate;
		return grossPay;
	}
}
