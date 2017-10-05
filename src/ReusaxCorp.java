import java.awt.List;
import java.util.ArrayList;

import java.util.Collections;

import employees.*;

public class ReusaxCorp {
	
	// ARRAYLIST TO HOLD ALL EMPLOYEES IN THE COMPANY
	private static ArrayList<Object> companyEmployee = new ArrayList<Object>(); // should it be of object or of

	// 1. CREATE AN EMPLOYEE
	public static void registerEmployee(Employee newRecruit) {
		companyEmployee.add(newRecruit);
	}

	// 2. PRINT ALL EMPLOYEES
	public static void printAllEmployees() {
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			// : prints the user to the console
			main.print("\n");
			main.print(" --------------------------- " + "\n");
			main.print(" ID : " + castemployee.getId() + "\n");
			main.print(" Clasification : " + castemployee.getClassification() + "\n");
			main.print(" Name : " + castemployee.getEmployeeName() + "\n");
			main.print(" Gross Salary : " + castemployee.getGrossSalary() + "\n");
			main.print(" Net Salary : " + castemployee.getNetSalary() + "\n");
		}
		main.print(" --------------------------- " + "\n");
		main.print("\n");
	}

	// 3. PRINT A SPECIFIC EMPLOYEE
	public static void printEmployee(String id) {
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {
				main.print("\n");
				main.print("--------------------------- " + "\n");
				main.print(castemployee.getClassification() + " Data : " + "\n");

				if (companyEmployee.get(i) instanceof Employee) {
					Employee UpdatedCast = (Employee) companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");

				} else if (companyEmployee.get(i) instanceof Intern) {
					Intern UpdatedCast = (Intern) companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");

				} else if (companyEmployee.get(i) instanceof Manager) {
					Manager UpdatedCast = (Manager) companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");

				} else if (companyEmployee.get(i) instanceof Director) {
					Director UpdatedCast = (Director) companyEmployee.get(i);
					main.print(UpdatedCast.toString() + "\n");
				}
				main.print(" --------------------------- " + "\n");
				main.print("\n");
				return;
			}
		}
	}
	//END PRINT SPECIFIC EMPLOYEE//

	// 4. REMOVE AN EMPLOYEE
	public static void removeEmployee(String id) {
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {
				companyEmployee.remove(i);
				return;
			}
		}
	}
	//END REMOVE AN EMPLOYEE//

	// 5. UPDATE AN EMPLOYEE
	public static void updateEmployee(String id, int choice, Object Change) {
		if (choice == 1) { // CHANGE THE NAME
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {

					if (companyEmployee.get(i) instanceof Employee) {
						Employee UpdatedCast = (Employee) companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Intern) {
						Intern UpdatedCast = (Intern) companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Manager) {
						Manager UpdatedCast = (Manager) companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Director) {
						Director UpdatedCast = (Director) companyEmployee.get(i);
						UpdatedCast.setEmployeeName(Change.toString());
						companyEmployee.set(i, UpdatedCast);
					}
				}
			}
		} else if (choice == 2) {// CHANGE THE SALARY
			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {

					if (companyEmployee.get(i) instanceof Employee) {
						Employee UpdatedCast = (Employee) companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double) Change);
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Intern) {
						Intern UpdatedCast = (Intern) companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double) Change);
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Manager) {
						Manager UpdatedCast = (Manager) companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double) Change);
						companyEmployee.set(i, UpdatedCast);

					} else if (companyEmployee.get(i) instanceof Director) {
						Director UpdatedCast = (Director) companyEmployee.get(i);
						UpdatedCast.setGrossSalary((Double) Change);
						companyEmployee.set(i, UpdatedCast);
					}
				}
			}
		} else if (choice == 3) { // CHANGE JOB SPECIFIC ATTRIBUTES

			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					Director UpdatedCast = (Director) companyEmployee.get(i);
					UpdatedCast.setDegree(Change.toString());
					;
					companyEmployee.set(i, UpdatedCast);
				}
			}
			// : Change department for director
		} else if (choice == 4) {

			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					Director UpdatedCast = (Director) companyEmployee.get(i);
					UpdatedCast.setDepartment(Change.toString());
					companyEmployee.set(i, UpdatedCast);
				}
			}
		} else if (choice == 5) {

			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					Manager UpdatedCast = (Manager) companyEmployee.get(i);
					UpdatedCast.setDegree(Change.toString());
					companyEmployee.set(i, UpdatedCast);
				}
			}
		} else if (choice == 6) {

			for (int i = 0; i < companyEmployee.size(); i++) {

				EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

				if (castemployee.getId().equals(id)) {
					Intern UpdatedCast = (Intern) companyEmployee.get(i);
					UpdatedCast.setGpa((int) Change);
					companyEmployee.set(i, UpdatedCast);
				}
			}

			// } else if (choice == 7) {
			//
			// } else if (choice == 8) {
			//
		}

	}
	//END UPDATE EMPLOYEE//

	// 6. PROMOTE/DEMOTE EMPLOYEE - 4 methods //
	public static void promoteToEmployee(String id) {
		// castEmployee = ((Employee) castEmployee); // ???
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {
				Employee employee = new Employee(id, castemployee.getEmployeeName(), castemployee.getGrossSalary());
				removeEmployee(id);
				companyEmployee.add(employee);
			}
		}
	}
	public static void promoteToIntern(String id, int gpa) {
		for (int i = 0; i < companyEmployee.size(); i++) {
			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {

				Intern intern = new Intern(id, castemployee.getEmployeeName(), castemployee.getGrossSalary(), gpa);
				removeEmployee(id);
				companyEmployee.add(intern);
			}
		}
	}
	public static void promoteToMananger(String id, String degree) {
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {

				Manager manager = new Manager(id, castemployee.getEmployeeName(), castemployee.getGrossSalary(),
						degree);
				removeEmployee(id);
				companyEmployee.add(manager);
			}
		}
	}
	public static void promoteToDirector(String id, String degree, String department) {
		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id)) {

				Director director = new Director(id, castemployee.getEmployeeName(), castemployee.getGrossSalary(),
						department, degree);
				removeEmployee(id);
				companyEmployee.add(director);
			}
		}
	}	
	//END PROMOTE/DEMOTE EMPLOYEE - 4 methods//

	// 7. SET DIRECTORS BENEFIT
	public static void setDirectorBenefits(double amount) {
		for (int i = 0; i < companyEmployee.size(); i++) {

			if (companyEmployee.get(i) instanceof Director) {
				Director castemployee = (Director) companyEmployee.get(i);
				castemployee.setDirectorsBenefit(amount);
			}
		}
	}

	// 8. PRINT TOTAL EXPENSES FOR THE COMPANY
	public static void getTotalExpences() {

		double totalMoney = 0;

		for (int i = 0; i < companyEmployee.size(); i++) {
			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);
			totalMoney += castemployee.getGrossSalary();
		}
		main.print(" ------------------------------------ " + "\n" + " |  Total expenses : " + totalMoney + "\n"
				+ " ------------------------------------ " + "\n" + "\n");
	}

	// 9. PRINT TOTAL NUMBER OF EMPLOYEES
	public static void getNumberOfEmployees() {
		main.print(" --------------------------- " + "\n");
		main.print(" Number of employees : " + companyEmployee.size());
		main.print(" --------------------------- " + "\n");

	}

	// : Sorting algorithm
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
	//END sorting algorithm//

	public static boolean findEmployee(String id) {

		boolean found = false;

		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id))
				found = true;
		}

		return found;
	}

	public static EmployeeDefinition getEmployee(String id) {

		EmployeeDefinition returnEmployee = null;

		for (int i = 0; i < companyEmployee.size(); i++) {

			EmployeeDefinition castemployee = (EmployeeDefinition) companyEmployee.get(i);

			if (castemployee.getId().equals(id))
				returnEmployee = castemployee;

		}

		return returnEmployee;

	}

}
