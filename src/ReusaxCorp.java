import java.awt.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

import employees.*;
import javafx.collections.ListChangeListener.Change;

public class ReusaxCorp {

	// : holds all employees
	private static ArrayList<Object> companyEmployee = new ArrayList<Object>(); // should it be of object or of
																				

	public static void registerEmployee(Employee newRecruit) {

		companyEmployee.add(newRecruit);

	}

	public static void removeEmployee(String id) {

		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {
				companyEmployee.remove(i);
				return;
			}

		}

	}

	public static void updateEmployee(String id , int choice , Object Change ) {

		if(choice == 1){ //CHANGE THE NAME
			
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					
					if (companyEmployee.get(i) instanceof Employee) {
						Employee UpdatedCast = (Employee)companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Intern) {
						Intern UpdatedCast = (Intern)companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Manager) {
						Manager UpdatedCast = (Manager)companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Director) {
						Director UpdatedCast = (Director)companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);
					}
				}
				
			}
			
			
		}else if(choice == 2) {//CHANGE THE SALARY
			
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					
					if (companyEmployee.get(i) instanceof Employee) {
						Employee UpdatedCast = (Employee)companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double)Change);
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Intern) {
						Intern UpdatedCast = (Intern)companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double)Change);
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Manager) {
						Manager UpdatedCast = (Manager)companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double)Change);
						companyEmployee.set(i, UpdatedCast);
						
					}else if(companyEmployee.get(i) instanceof Director) {
						Director UpdatedCast = (Director)companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double)Change);
						companyEmployee.set(i, UpdatedCast);
					}
				}
				
			}
			
				
		}else if(choice == 3) {

			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
			
					Director UpdatedCast = (Director)companyEmployee.get(i);
					UpdatedCast.setDegree(Change.toString());;
					companyEmployee.set(i, UpdatedCast);
				}
			}
			
		}else if(choice == 4) {
			
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
			
					Director UpdatedCast = (Director)companyEmployee.get(i);
					UpdatedCast.setDepartment(Change.toString());
					companyEmployee.set(i, UpdatedCast);
				}
			}
			
		}else if(choice == 5) {
			
		}else if(choice == 4) {
			
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					
					int userInput = (int)Change;
					
					upDownCast(castemployee, userInput); //????
					
				}
				
			}
			
		}
		
	}
	
	public static void upDownCast(EmployeeDefinition castEmployee, int userInput) { //OR make it take string id or something else??
		if(userInput == 1) {
			promoteToDirector(castEmployee);
		}else if(userInput == 2) {
			promoteToMananger(castEmployee);
		}else if(userInput == 3) {
			promoteToIntern(castEmployee);
		}else if(userInput == 4) {
			promoteToEmployee(castEmployee);
		}
	}

	public static void getTotallExpences(String id) {

		double tottalMoney = 0;

		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);
			tottalMoney += castemployee.getGrossSalary();
		}

	    main.print(" ------------------------------------ " + "\n"
				+ " |  Total expenses : " + tottalMoney + "\n"
				+ " ------------------------------------ " + "\n" + "\n");

	}

	public static void printEmployee(String id) {

		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {
				
				main.print("\n");
				main.print("--------------------------- " + "\n");
				main.print(castemployee.getClassification() + " Data : " + "\n");
				
				if (companyEmployee.get(i) instanceof Employee) {
					Employee UpdatedCast = (Employee)companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");
					
				}else if(companyEmployee.get(i) instanceof Intern) {
					Intern UpdatedCast = (Intern)companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");
					
				}else if(companyEmployee.get(i) instanceof Manager) {
					Manager UpdatedCast = (Manager)companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");
					
				}else if(companyEmployee.get(i) instanceof Director) {
					Director UpdatedCast = (Director)companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");
				}
				
				main.print(" --------------------------- " + "\n");
				main.print("\n");
				return;

			}
		}

	}

	public static void printAllEmployees() {
	
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			// : prints the user to the console
			main.print("\n");
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + castemployee.getId() + "\n");
			main.print(" Clasification : " + castemployee.getClassification()+ "\n");
			main.print(" Name : " + castemployee.getEmployeeName() + "\n");
			main.print(" Gross Salary : " + castemployee.getGrossSalary() + "\n");
			main.print(" Net Salary : " + castemployee.getNetSalary() + "\n");
			

		}
		
		main.print(" --------------------------- " + "\n");
		main.print("\n");
		
	}

	// TODO : check
	public static void setDirectorBenefits(double amount) {

		for (int i = 0; i < companyEmployee.size(); i++) {

			if (companyEmployee.get(i) instanceof Director) {

				Director castemployee = (Director) companyEmployee.get(i);

				castemployee.setDirectorsBenefit(amount);
			}

		}

	}

	public static void getNumberOfEmployees() {
		main.print(" --------------------------- " + "\n");
		main.print(" Number of employees : " + companyEmployee.size());
		main.print(" --------------------------- " + "\n");

	}

	// : promote methods

	public static void promoteToEmployee(EmployeeDefinition castEmployee) {

		castEmployee = ((Employee)castEmployee); //???
		
	}

	public static void promoteToIntern(EmployeeDefinition castEmployee) {
		
		castEmployee = ((Intern)castEmployee);
	}

	public static void promoteToMananger(EmployeeDefinition castEmployee) {
		
		castEmployee = ((Manager)castEmployee);

	}

	public static void promoteToDirector(EmployeeDefinition castEmployee) {
		
		castEmployee = ((Director)castEmployee);

	}

	// : Sorting algorith
	public static void Sort() {

		for (int i = 0; i < companyEmployee.size(); i++) {

			for (int z = i; z < companyEmployee.size(); z++) {

				// : Gets the name of the employees
				String compare1 = ((EmployeeDefinition) companyEmployee.get(i)).getEmployeeName().toString();
				String compare2 = ((EmployeeDefinition) companyEmployee.get(z)).getEmployeeName().toString();

				// : compares the two
				int compare = compare1.compareTo(compare2);
				if (compare < 0) {
					// : If a is compare1 is bigger than compare2
					// : Does nothing and moves on
				} else if (compare > 0) {
					// : If a is compare2 is bigger than compare1
					// : Swaps the elements
					Collections.swap(companyEmployee, i, z);
				} else {
					// : If a is compare1 is the same as compare2
					// : Checks the gross income

					// : Gets the name of the employees
					double compareInt1 = ((EmployeeDefinition) companyEmployee.get(i)).getGrossSalary();
					double compareInt2 = ((EmployeeDefinition) companyEmployee.get(z)).getGrossSalary();

					if (compareInt2 > compareInt1) {
						// : If a is compare2 is bigger than compare1
						// : Swaps the elements
						Collections.swap(companyEmployee, i, z);
					}

				}

			}

		}

	}

}
