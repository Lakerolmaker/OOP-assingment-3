import java.util.Scanner;

import employees.*;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		menu.printLogo();

		// : While-loop that keeps the progrm running forever.
		while (true) {

			// : Dispalys the menu
			System.out.print("" + " ------------------------------------------ " + "\n"
					+ " |                 Menu                   | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 1 to register an employee        | " + "\n"
					+ " |--------------------------------------- | " + "\n"
					+ " | Press 2 to print all employees         | " + "\n"
					+ " |--------------------------------------- | " + "\n"
					+ " | Press 3 to print a specified employee  | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 4 to remove an employee          | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 5 to update an employee          | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 6 to change position of employee | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 7 to set director benefits       | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 8 to print total expenses        | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 9 to print number of employees   | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 10 to sort employees             | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 11 to quit the program           | " + "\n"
					+ " ---------------------------------------- | " + "\n" + " Input a choice : ");

			// : Gets the user input, with some fail safes
			//Scanner menuScanner = new Scanner(System.in);
			int input = 0;
			try {
				input = sc.nextInt();
			} catch (Exception e) {
			}

			switch (input) {

			case (1):
				
			
					System.out.print("Enter the ID of the new employee: ");
					String empoyeeId = sc.next();
				
					if (ReusaxCorp.findEmployee(empoyeeId) == true) {

						print("\n ------------------------------------ " + "\n" 
						      + " |     Error , ID already in use   | "+ "\n"
					          + " ------------------------------------ " + "\n" + "\n");

						// :Exits back to the main menu
						break;
					}
					
					
					System.out.println("Enter the position of the employee: (Available: 1.Regular, 2.Intern, 3.Manager, 4.Director.");
					int employeePosition = sc.nextInt();

				if (employeePosition == 1) {
							
					System.out.print("Enter the name of the regular employee: ");
					String employeeName = sc.next();
					System.out.print("Enter the gross salary of the regular employee: ");
					double employeesalary = sc.nextDouble();			
							
					Employee createdEmpoyee = new Employee(empoyeeId, employeeName, employeesalary);
					ReusaxCorp.registerEmployee(createdEmpoyee);

				} else if (employeePosition == 2) {

					System.out.print("Enter the name of the new intern: ");
					String employeeName = sc.next();
					System.out.print("Enter the gross salary of the new intern: ");
					double employeesalary = sc.nextDouble();
					System.out.print("Enter the GPA of the new intern : (Number from 1 to 10)");
					int gpa = sc.nextInt();

					Intern createdEmpoyee = new Intern(empoyeeId, employeeName, employeesalary, gpa);
					ReusaxCorp.registerEmployee(createdEmpoyee);

				} else if (employeePosition == 3) {
				
					System.out.print("Enter the name of the new manager: ");
					String employeeName = sc.next();
					System.out.print("Enter the gross salary of the new manager: ");
					double employeesalary = sc.nextDouble();
					System.out.print("Enter the degree of the new manager : ( Available : 1.BSc , 2.MSc , 3.PhD ) ");
					int choice = sc.nextInt();
					
					String degree = "";
					
					if(choice == 1) {
						degree = "bsc";
					}else if(choice == 2) {
						degree = "msc";
					}else if(choice == 3) {
						degree = "phd";
					}

					Manager createdEmpoyee = new Manager(empoyeeId, employeeName, employeesalary, degree);
					ReusaxCorp.registerEmployee(createdEmpoyee); 
					
				} else if (employeePosition == 4) {
				
					System.out.print("Enter the name of the new director: ");
					String employeeName = sc.next();
					System.out.print("Enter the gross salary of the new director: ");
					double employeesalary = sc.nextDouble();
					System.out.print("Enter the degree of the new director: ( Available : 1.BSc , 2.MSc , 3.PhD ) ");
					int choice = sc.nextInt();
					
					String degree = "";
					
					if(choice == 1) {
						degree = "bsc";
					}else if(choice == 2) {
						degree = "msc";
					}else if(choice == 3) {
						degree = "phd";
					}
									
					System.out.println(
							"Enter the department of the new director: ( Available: Technical, Human resources, Business ) ");
					String department = sc.next();

					Director createdEmpoyee = new Director(empoyeeId, employeeName, employeesalary, department,
							degree);
					ReusaxCorp.registerEmployee(createdEmpoyee);

					main.print(
							" ------------------------------------ " + "\n" 
						  + " |     Success , emplyee created    | " + "\n" 
				          + " ------------------------------------ " + "\n" + "\n");
				}

				break;
			case (2):
				// Print all employees sorted
				ReusaxCorp.Sort();
				ReusaxCorp.printAllEmployees();

				break;
			case (3):
				// Print specific employee
				System.out.println("Enter the ID of the person whose info you want to print: ");
				String id = sc.next();
				ReusaxCorp.printEmployee(id);

				break;
			case (4):
				// Remove employee
				System.out.println("Enter the ID of the person whom you want to remove: ");
				id = sc.next(); // ??
				ReusaxCorp.removeEmployee(id);

				break;
			case (5):
				// Update an employee
				System.out.println("Enter the ID of the employee you want to update:");
				String idChange = sc.next();

				// : Checks of the employee exits
				if (ReusaxCorp.findEmployee(idChange) == false) {

					print(" ------------------------------------ " + "\n" 
					    + " |     Error , employee not found    | "+ "\n"
						+ " ------------------------------------ " + "\n" + "\n");

					// :Exits back to the main menu
					break;
				}
				
				System.out.println("What would you like to change: ");
				System.out.println("1. Change employee name ");
				System.out.println("2. Change employee salary ");
				System.out.println("3. Change jobspecific attributes (tex if its a manager u can change its degree)");

				int userInp = sc.nextInt();

				if (userInp == 1) {
					System.out.println("Enter the new name of the employee: ");
				//	Scanner nameScanner = new Scanner(System.in);
					String employeeName = sc.nextLine();
					ReusaxCorp.updateEmployee(idChange, 1, employeeName);

				} else if (userInp == 2) {
					System.out.println("Enter the new salary of the employee: ");
					double grossSalary = sc.nextDouble();
					ReusaxCorp.updateEmployee(idChange, 2, grossSalary);

				} else if (userInp == 3) {
					
					/////////CHANGE THIS///////////
					///Make if else statements depending of what classification the specified ID has

					System.out.println("Who would you like to change: ");///GET RID OF ALL THESE
					System.out.println("1. Director ");
					System.out.println("2. Manager ");
					System.out.println("3. Intern ");

					int SpecifiedScan = sc.nextInt();

					if (SpecifiedScan == 1) {
						// companyEmployee= new Director(companyEmployee);
						System.out.println("Select what you want to change for this director: ");
						System.out.println("1. Change degree");
						System.out.println("2. Change department");

						int DirectorScan = sc.nextInt();

						if (DirectorScan == 1) {
							System.out.println("Input new degree: (Available: 1.BSc 2.MSc 3.PhD) ");
						//	Scanner degreeScan = new Scanner(System.in);
							String degreeInput = sc.nextLine();
							ReusaxCorp.updateEmployee(idChange, 3, degreeInput);

						} else if (DirectorScan == 2) {
							System.out.println("Input new department : ");
						//	Scanner depertmentScan = new Scanner(System.in);
							String depertmentInput = sc.nextLine();
							ReusaxCorp.updateEmployee(idChange, 4, depertmentInput);

						}

					} else if (SpecifiedScan == 2) {
						System.out.println("Select what you want to change for this manager:  ");
						System.out.println("1. Change degree");

						int managerScan = sc.nextInt();

						if (managerScan == 1) {
							System.out.println("Input new degree  : ");
						//	Scanner degreeScan = new Scanner(System.in);
							String degreeInput = sc.nextLine();
							ReusaxCorp.updateEmployee(idChange, 5, degreeInput);
						}

					} else if (SpecifiedScan == 3) {

						System.out.println("Select what you want to change for this intern: ");
						System.out.println("1. Change GPA");

						int internscan = sc.nextInt();

						if (internscan == 1) {
							System.out.println("Input new degree  : ");
						//	Scanner GpaScan = new Scanner(System.in);
							int GpaInpiut = sc.nextInt();
							ReusaxCorp.updateEmployee(idChange, 6, GpaInpiut);
						}

					}

				} 
//				

				break;
			case (6):
				System.out.println("Enter the ID of the employee you want to change position: ");
				id = sc.next(); //make a methods to fetch the object
				System.out.println("Enter the position you want to change it to: ");
				System.out.println("Available: 1.Regular, 2.Intern, 3.Manager, 4.Director");
			//	Scanner ChoiceScan = new Scanner(System.in);
				int newPosition = sc.nextInt();
				//ReusaxCorp.updateEmployee(employeeId, newPosition);
				if(newPosition == 1) { //regular			
					//put fetched object here
					ReusaxCorp.promoteToEmployee(id);
					System.out.println("Changed to regular employee (hopefully)");
					
				}else if(newPosition==2) {//intern
					System.out.println("Enter the GPA of the intern (number between 0-10");
					int gpa = sc.nextInt();
					ReusaxCorp.promoteToIntern(id, gpa);
					
				}else if(newPosition == 3) {//manager
					System.out.println("Enter the degree of the manager : ( Avalable : BSc , MSc , PhD )");
					String degree = sc.next();
					ReusaxCorp.promoteToMananger(id, degree);
					
				}else if(newPosition==4) {//director
					System.out.println("Enter the degree of the director : ( Avalable : BSc , MSc , PhD )");
					String degree = sc.next();
					System.out.println("Enter the department of the director : ( Available: Technical, Human resources, Business )");
					String department = sc.next();
					ReusaxCorp.promoteToDirector(id, degree, department );
					
				}

				break;
			case (7):

				// TODO
				// Set directors benefit
				System.out.println("Enter the new directors benefit: ");
				double amount = sc.nextDouble();
				ReusaxCorp.setDirectorBenefits(amount);
				System.out.println("Success! New directorsbenefit set to: " + amount);

				break;
			case (8):
				// Print total expenses!!!	
				ReusaxCorp.getTotalExpences();

				break;
			case (9):
				// PRINT NUMBER OF EMPLOYEEES
				ReusaxCorp.getNumberOfEmployees();

				break;
			case (10):

				// : Exits the program
				//need to change this to show the before and after sorting in the console??
				ReusaxCorp.Sort();

				break;
			case (11):

				// : Exits the program
				System.exit(0);

				break;
			default:

				print("\n" + " ------------------------------------ " + "\n" + " |    Error , Not a valid option    | "
						+ "\n" + " ------------------------------------ " + "\n" + "\n");

				break;

			}

		}
	}

	public static void print(Object o) {
		System.out.print(o);

	}

	public static void cls() {
		for (int i = 0; i < 100; i++) {
			print("\n");
		}
	}

}
