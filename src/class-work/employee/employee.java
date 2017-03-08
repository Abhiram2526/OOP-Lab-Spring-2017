/**
******* CLASS EMPLOYEE ********
* 
* Three Variable :
* 1. first-name : String
* 2. last-name : String
* 3. salary : double
* A constructor to initialize the above.
*
* Two Methords :
* 1. set methord : assign the value (only one parameter)
* 2. get methord : get the value AND return the value
*/


 public class employee {

 	private String firstname;
 	private String lastname;
 	private double monthlySalary;

 	// Constructor to initialize 
 	public employee(String firstname, String lastname, double monthlySalary) {
 		this.firstname = firstname;
 		this.lastname = lastname;
 		if(monthlySalary>0.0) 
 			this.monthlySalary = monthlySalary;
 	}

 	// Set Methords
 	void setFirstname(String firstname) {
 		this.firstname = firstname;
 	}
 	void setLastname(String lastname) {
 		this.lastname = lastname;
 	}
 	void setMonthlySalary(double monthlySalary) {
 		if(monthlySalary>0.0)
 			this.monthlySalary = monthlySalary;
 	}

 	// Get Methords
 	String getFirstname() {
 		return firstname;
 	}
 	String getLastname() {
 		return lastname;
 	}
 	double getMonthlySalary() {
 		return monthlySalary;
 	}

 }