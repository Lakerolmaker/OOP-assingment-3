import java.awt.List;
import java.util.ArrayList;
import employees.*;

public class ReusaxCorp {
	
	
	double directorsBenefit = 5000;

	public void setDirectorsBenefit(double directorsBenefit) {
		this.directorsBenefit = directorsBenefit;
	}

	private static ArrayList<Employee> companyEmployee =  new ArrayList<Employee>();
	
	
	
	public static void registerEmployee(Employee newRecruit) {

		companyEmployee.add(newRecruit);
		
	}
	
	public static void removeEmployee(String id) {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			if(companyEmployee.get(i).getEmployeeName().equals(id)) {
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
			
			tottalMoney += companyEmployee.get(i).getGrossSalary();
		}
		
		
			main.print(
	    	 	" ------------------------------------ "	+ "\n" +
	    	 	" |    Total expenses : " + tottalMoney + "\n" +
	        " ------------------------------------ "	+ "\n" + "\n") ;
		
		
	}
	
	public static void printEmployee(String id) {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			if(companyEmployee.get(i).getEmployeeName().equals(id)) {
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + companyEmployee.get(i).getId() + "\n");
			main.print(" Name : " + companyEmployee.get(i).getEmployeeName() + "\n");
			main.print(" Gross Salary : " + companyEmployee.get(i).getGrossSalary() + "\n");
			main.print(" Net Salary : " + companyEmployee.get(i).getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			return;
			
			}
		}
		
	}
	
	public static void printAllEmployees() {
		main.print("hello");
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + companyEmployee.get(i).getId() + "\n");
			main.print(" Name : " + companyEmployee.get(i).getEmployeeName() + "\n");
			main.print(" Gross Salary : " + companyEmployee.get(i).getGrossSalary() + "\n");
			main.print(" Net Salary : " + companyEmployee.get(i).getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			
			
		}
		
	}
	
	// TODO : check 
	public static void setDirecotrBenefits() {
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			if(companyEmployee.get(i).getClass().isInstance(Director.class)) {
				
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
		
		
		
	}
	
}
