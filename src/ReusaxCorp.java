import java.awt.List;
import java.util.ArrayList;
import employees.*;

public class ReusaxCorp {
		

	

	private static ArrayList<Object> companyEmployee =  new ArrayList<Object>();
	
	
	
	public static void registerEmployee(Employee newRecruit) {

		companyEmployee.add(newRecruit);
		
	}
	
	public static void removeEmployee(String id) {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			
			if(castemployee.getId().equals(id)) {
				companyEmployee.remove(i);
				return;
			}
			
		}
		
	}
	
	public static void updateEmployee(String id) {
		
	}
	
	public static void getTotallExpences(String id) {
		
		double tottalMoney = 0;
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			tottalMoney += castemployee.getGrossSalary();
		}
		
			main.print(
	    	 	" ------------------------------------ "	+ "\n" +
	    	 	" |    Total expenses : " + tottalMoney + "\n" +
	        " ------------------------------------ "	+ "\n" + "\n") ;
		
		
	}
	
	public static void printEmployee(String id) {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			
			if(castemployee.getId().equals(id)) {
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + castemployee.getId() + "\n");
			main.print(" Name : " + castemployee.getEmployeeName() + "\n");
			main.print(" Gross Salary : " + castemployee.getGrossSalary() + "\n");
			main.print(" Net Salary : " + castemployee.getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			return;
			
			}
		}
		
	}
	
	public static void printAllEmployees() {
		main.print("hello");
		
		for(int i = 0; i < companyEmployee.size(); i++) {
						
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + castemployee.getId() + "\n");
			main.print(" Name : " + castemployee.getEmployeeName() + "\n");
			main.print(" Gross Salary : " + castemployee.getGrossSalary() + "\n");
			main.print(" Net Salary : " + castemployee.getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			
			
		}
		
	}
	
	// TODO : check 
	public static void setDirectorBenefits(double amount) {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			if(companyEmployee.get(i) instanceof Director) {
				
				Director castemployee = (Director)companyEmployee.get(i);

				castemployee.setDirectorsBenefit(amount);
			}
			
		}
		
	}
	
	public static void getNumberOfEmployees() {
		main.print(" --------------------------- " + "\n");
		main.print("Number of employees : " + companyEmployee.size());
		main.print(" --------------------------- " + "\n");
	
	}
	
	
	//: promote methods

	public static void promoteToEmployee() {
		
	}
	
	public static void promoteToDIntern() {
		
	}
	
	public static void promoteToMananger() {
		
	}
	
	public static void promoteToDirector() {
		
	}
	
	//: Sorting algorith
	public static void SortAlfabeticaly() {
			
		//companyEmployee.
		//
	}
	
	
	
	
	
	
}
