import java.awt.List;
import java.util.ArrayList;
import employees.*;

public class ReusaxCorp {

	private static ArrayList<Employee> comanyEmplyee = new ArrayList<Employee>();
	
	
	public static void registerEmployee(Employee newRecruit) {

		comanyEmplyee.add(newRecruit);
		
	}
	
	public static void removeEmployee(String id) {
		
		for(int i = 0; i < comanyEmplyee.size(); i++) {
			
			if(comanyEmplyee.get(i).getEmployeeName().equals(id)) {
				comanyEmplyee.remove(i);
				return;
			}
			
		}
		
	}
	
	public static void updateEmployee(String id) {
		
	}
	
	public static void getTotallExpences(String id) {
		
		double tottalMoney = 0;
		
		for(int i = 0; i < comanyEmplyee.size(); i++) {
			
			tottalMoney += comanyEmplyee.get(i).getGrossSalary();
		}
		
		
			main.print(
	    	 	" ------------------------------------ "	+ "\n" +
	    	 	" |    Total expenses : " + tottalMoney + "\n" +
	        " ------------------------------------ "	+ "\n" + "\n") ;
		
		
	}
	
	public static void printEmployee(String id) {
		
		for(int i = 0; i < comanyEmplyee.size(); i++) {
			
			if(comanyEmplyee.get(i).getEmployeeName().equals(id)) {
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + comanyEmplyee.get(i).getId() + "\n");
			main.print(" Name : " + comanyEmplyee.get(i).getEmployeeName() + "\n");
			main.print(" Gross Salary : " + comanyEmplyee.get(i).getGrossSalary() + "\n");
			main.print(" Net Salary : " + comanyEmplyee.get(i).getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			return;
			
			}
		}
		
	}
	
	public static void printAllEmployees() {
		main.print("hello");
		
		for(int i = 0; i < comanyEmplyee.size(); i++) {
			
			//: prints the user to the console
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + comanyEmplyee.get(i).getId() + "\n");
			main.print(" Name : " + comanyEmplyee.get(i).getEmployeeName() + "\n");
			main.print(" Gross Salary : " + comanyEmplyee.get(i).getGrossSalary() + "\n");
			main.print(" Net Salary : " + comanyEmplyee.get(i).getNetSalary() + "\n");
			main.print(" --------------------------- " + "\n" + "\n");
			
			
		}
		
	}
	
	// TODO : check 
	public static void setDirecotrBenefits() {
		
		for(int i = 0; i < comanyEmplyee.size(); i++) {
			
			if(comanyEmplyee.get(i).getClass().isInstance(Director.class)) {
				
			}
			
		}
		
	}
	
	public static void getNumberOfEmployees() {
		main.print(" --------------------------- " + "\n");
		main.print("Number of employees : " + comanyEmplyee.size());
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
