/**
* (Employee Class) A class called Employee that includes three instance variables—
* a first name (type String ), a last name (type String ) and a monthly salary
* ( double ). It also has a constructor that initializes the three instance variables.
* Provide a set and a get method for each instance variable. If the monthly salary is not
* positive, do not set its value.
*/

 public class employee {

 	private String firstName;
 	private String lastName;
 	private double monthlySalary;

 	public employee(String f, String l, double m) {
 		firstName = f;
 		lastName = l;
 		if(m>0.0)
 			monthlySalary = m;
 	}

 	public employee() {
 		firstName = "Tony";
 		lastName = "Stark";
 		monthlySalary = 2000.00;
 	}

 	// set-methords to set the value of the instances
 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}
 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}
 	public void setMonthlySalary(double monthlySalary) {
 		if(monthlySalary>0.0)
 			this.monthlySalary = monthlySalary;
 	}

 	// get-methords to get the values and return 
 	public String getFirstName() {
 		return firstName;
 	}
 	public String getLastName() {
 		return lastName;
 	}
 	public double getMonthlySalary() {
 		return monthlySalary;
 	}

 	public String toString() {
 		return "\nFirst Name : " + this.firstName + "\nLast Name : " + this.lastName
 			 + "\nMonthly Salary : " + this.monthlySalary; 
 	}

 }