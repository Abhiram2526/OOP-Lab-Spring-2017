/**
******* EMPLOYEE TEST ********
* This program test the Employee class.
* # Create two Objects & assign them values
* # Display the yearly salary
* # Give him/her a 10% raise
* # Display his/her new salary
*/


 public class employeeTest {
 	public static void main(String[] args) {

 		employee employee1 = new employee("TONY","STARK",177.56);
 		employee employee2 = new employee("ELON","MUSK",182.69);

 		System.out.printf("Yearly Salary of %s %s  : %.2f\n", employee1.getFirstname(),
 			employee1.getLastname(),employee1.getMonthlySalary()*12);

 		employee1.setMonthlySalary(employee1.getMonthlySalary() + 0.10*employee1.getMonthlySalary());
 		System.out.printf("New Salary of %s %s : %.2f\n", employee1.getFirstname(),
 			employee1.getLastname(),employee1.getMonthlySalary());
 			
 	}
 }