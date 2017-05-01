/**
* A test app named EmployeeTest that demonstrates class Employee ’s capabilities.
* It has two Employee objects and it displays each object’s yearly salary.
* Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/

 public class employeeTest {
 	public static void main(String[] args) {

 		// Creating object 1 and initiallizing with the constructor 
 		employee employee1 = new employee("Snehasis", "Mohapatra", 69.69);
  		
 		// Creating object 2 and initiallizing with set-methords
 		employee employee2 = new employee();
 		employee2.setFirstName("Sheldon");
 		employee2.setLastName("Cooper");
 		employee2.setMonthlySalary(182.63);

 		// Showing yearly salary
 		System.out.printf("Yearly Salary of %s %s is %.2f\n", employee1.getFirstName(),
 		 	employee1.getLastName(), employee1.getMonthlySalary()*12);
 		System.out.printf("Yearly Salary of %s %s is %.2f\n", employee2.getFirstName(),
 		 	employee2.getLastName(), employee2.getMonthlySalary()*12);

 		employee1.setMonthlySalary(employee1.getMonthlySalary() + 0.10*employee1.getMonthlySalary());

 		// Showing yearly salary with 10% raise 
 		System.out.printf("Yearly Salary of %s %s of after 10 percent raise is %.2f\n", employee1.getFirstName(),
 		 	employee1.getLastName(), employee1.getMonthlySalary()*12);
 		System.out.printf("Yearly Salary of %s %s of after 10 percent raise is %.2f\n", employee2.getFirstName(),
 		 	employee2.getLastName(), (employee2.getMonthlySalary() + 0.1*employee2.getMonthlySalary())*12);
 		System.out.println(employee2);
 	}
 }
