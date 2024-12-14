package ddefault;

public class InheritanceTest {

	public static void main(String[] args) {
		// Print employee information obtained by get methods and earnings
		System.out.println("Employee information obtained by get methods and earnings: \n\n");
		// Create an instance of BasePlusCommisionEmployee with first name, last name, SSN, gross sales, commission rate, and base salary
		BasePlusCommisionEmployee base=new BasePlusCommisionEmployee("Bob","Lewis","333-33-3333",5000.00,0.04,300.00);
		 // Print the employee information using the toString method
        System.out.println(base.toString());
        
         // Print updated employee information and earnings after updating the base salary
        base.setbaseSalary(1000.00);
        
        System.out.println("\nUpdated employee information obtained by toStrings and earnings: \n\n");
        System.out.println(base.toString());
	}

}
