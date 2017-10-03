import java.awt.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

import employees.*;
import javafx.collections.ListChangeListener.Change;

public class ReusaxCorp {


	//: holds all employees
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
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < companyEmployee.size(); i++) {
			
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			
			//if(companyEmployee.get(i).getClassification)
			if(castemployee.getId().equals(id)) {
				System.out.println("What would you like to change: ");
				System.out.println("1. Change employee name ");
				System.out.println("2. Change employee salary ");
				System.out.println("3. Change jobspecific attributes (tex if its a manager u can change its degree)");
				System.out.println("4. Change employee position in company (promote/demote)"); //upcasting downcasting
				int userInp = scanner.nextInt();
				
				if(userInp == 1) {
					System.out.println("Enter the new name of the employee: ");
					String employeeName = scanner.nextLine();
					castemployee.setEmployeeName(employeeName); //now the name changes to nothing! -.- fk
					
				}else if(userInp == 2) {
					System.out.println("Enter the new salary of the employee: ");
					double grossSalary = scanner.nextDouble();
					castemployee.setGrossSalary(grossSalary);
					
				}else if(userInp == 3) {
					//set specific things tex degree, department osv
					if(castemployee.getClassification().equals("Director")) {
						//companyEmployee= new Director(companyEmployee);
						System.out.println("Select what you want to change for this director: ");
						System.out.println("1. Change degree");
						System.out.println("2. Change department");
						
					}else if(castemployee.getClassification().equals("Manager")) {
						System.out.println("Select what you want to change for this manager: ");
						System.out.println("1. Change degree");
						
					}else if(castemployee.getClassification().equals("Intern")) {
						
						System.out.println("Select what you want to change for this intern: ");
						System.out.println("1. Change GPA");
						userInp = scanner.nextInt();
						if(userInp == 1) {
							System.out.println("Please enter new GPA: ");
							
							int newGpa = scanner.nextInt();
							castemployee = (Intern)companyEmployee.get(i);
							//castemployee.setGpa(newGpa);
						}
					}
					
				}else if (userInp == 4) {
					
				}
			}else {
				System.out.println("Employee by that name not found.");
			}
		}
	
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
	
		
		for(int i = 0; i < companyEmployee.size(); i++) {
						
			EmployeeDefinition castemployee = (EmployeeDefinition)companyEmployee.get(i);
			
			//: prints the user to the console
			main.print("\n");
			main.print("\n" + " --------------------------- " + "\n");
			main.print(" ID : " + castemployee.getId() + "\n");
			main.print(" Name : " + castemployee.getEmployeeName() + "\n");
			main.print(" Gross Salary : " + castemployee.getGrossSalary() + "\n");
			main.print(" Net Salary : " + castemployee.getNetSalary() + "\n");
			main.print("\n");
				
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
		main.print(" Number of employees : " + companyEmployee.size());
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
	public static void Sort() {
			
	for(int i = 0; i < companyEmployee.size(); i++) {

		for(int z = i; z < companyEmployee.size(); z++) {
			
			//: Gets the name of the employees
			String compare1 = ((EmployeeDefinition)companyEmployee.get(i)).getEmployeeName().toString();
			String compare2 = ((EmployeeDefinition)companyEmployee.get(z)).getEmployeeName().toString();

			//: compares the two
			int compare = compare1.compareTo(compare2);
			if (compare < 0){
				//: If a is compare1 is bigger than compare2
			    //: Does nothing and moves on
			}else if (compare > 0) {
				//: If a is compare2 is bigger than compare1
			    //: Swaps the elements
				Collections.swap(companyEmployee, i, z);
			}else {
				//: If a is compare1 is the same as compare2
			    //: Checks the gross income
			    
				//: Gets the name of the employees
				double compareInt1 = ((EmployeeDefinition)companyEmployee.get(i)).getGrossSalary();
				double compareInt2 = ((EmployeeDefinition)companyEmployee.get(z)).getGrossSalary();
				
				if(compareInt2 > compareInt1) {
				     //: If a is compare2 is bigger than compare1
					 //: Swaps the elements
					Collections.swap(companyEmployee, i, z);
				}
				
			}
			
				
		}

	}
	
	
}
	
	
	
}
