package ddefault;

public class CommisionEmployee {
	// Private data fields for employee information
private String firstName,lastName,socialSecurityNumber;
private double grossSales,commisionRate;

//Constructor with 5 parameters. Validates grossSales and commisionRate and assigns values to fields
CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate){
	
	  // If grossSales is negative, print an error message and terminate the program
	if(grossSales<0) {
		System.out.println("Error! Gross Sales must be greater than 0 or equal to 0");
	System.exit(1);
	}
	// If commisionRate is not between 0 and 1, print an error message and terminate the program
	if(commisionRate<=0||commisionRate>=1) {
		System.out.println("Error! Commission Rate must be greater than 0 and lower than 1");
		System.exit(1);
	}
	 // Assign values to the data fields if they are valid
	this.firstName=firstName;
	this.lastName=lastName;
	this.socialSecurityNumber=socialSecurityNumber;
	this.grossSales=grossSales;
	this.commisionRate=commisionRate;
	
	
}
//Getter methods for accessing the values of the private data fields
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getSocialNum() {
	return socialSecurityNumber;
}
public double getGrossSales() {
	return grossSales;
}
public double getCommisionRate() {
	return commisionRate;
}

// Setter methods for modifying the values of the private data fields
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName=lastName;
}
public void setSocialNum(String socialSecurityNumber) {
	this.socialSecurityNumber=socialSecurityNumber;
}
public void setgrossSales(double grossSales) {
	this.grossSales=grossSales;
}
public void setCommisionRate(double commisionRate) {
	this.commisionRate=commisionRate;
}

//Method to calculate earnings.
public double earings(){
	return (grossSales*commisionRate);
}

//Method to return the employee's information as a string
public String toString() {
	 return "First name: " + firstName + "\nLast name: " + lastName +
             "\nSocial security number: " + socialSecurityNumber + 
             "\nGross Sales: " + grossSales + 
             "\nCommission Rate: " + commisionRate;
}

}
