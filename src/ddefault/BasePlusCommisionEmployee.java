package ddefault;

//The BasePlusCommisionEmployee class is a subclass of CommisionEmployee. 
//It includes a base salary along with commission for calculating earnings.
public class BasePlusCommisionEmployee extends CommisionEmployee {
	
	// Private data field for base salary
	private double baseSalary;
	
// Constructor with 6 parameters. Calls the superclass constructor and assigns values to data fields.
BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate,double baseSalary) {
// Calls the superclass constructor to initialize inherited fields
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
// Assign the base salary value
		this.baseSalary=baseSalary;
	}

//Getter and setter methods for the base salary
public double getbaseSalary() {
	return baseSalary;
}

public void setbaseSalary(double baseSalary) {
	this.baseSalary=baseSalary;
}
// Overridden earnings method.
public double earnings() {
    return baseSalary + (getGrossSales() * getCommisionRate());
}
//Overridden toString method. Adds base salary and earnings
public String toString() {
	return super.toString()+"\nBase Salary:"+baseSalary+"\nEarnings: "+earnings();
}
}
