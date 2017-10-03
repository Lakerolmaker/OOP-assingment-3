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
					+ " | Press 2 to print all employee          | " + "\n"
					+ " |--------------------------------------- | " + "\n"
					+ " | Press 3 to print a specified emplyee   | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 4 to remove an employee          | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 5 to update an employee          | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 6 to set director benefits       | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 7 to print totall expenses       | " + "\n"
					+ " ---------------------------------------- | " + "\n"
					+ " | Press 10 to quit the program           | " + "\n"
					+ " ---------------------------------------- | " + "\n" + " Input a choice : ");

			// : Gets the user input, with some fail safes
			Scanner menuScanner = new Scanner(System.in);
			int input = 0;
			try {
				input = menuScanner.nextInt();
			} catch (Exception e) {
			}

			switch (input) {

			case (1):

				System.out.print("Enter the ID of the new employee : ");
				String eompoyeeId = sc.next();
				Employee createdEmpoyee = new Employee(eompoyeeId, "", 0.0);

				System.out.print("Enter the name of the employee : ");
				String employeeName = sc.next();
				createdEmpoyee.setEmployeeName(employeeName);

				System.out.print("Enter the gross salary of the employee: ");
				double employeesalary = sc.nextDouble();
				createdEmpoyee.setGrossSalary(employeesalary);

				ReusaxCorp.registerEmployee(createdEmpoyee);

				main.print(" ------------------------------------ " + "\n" + " |     Success , emplyee created    | "
						+ "\n" + " ------------------------------------ " + "\n" + "\n");

				break;
			case (2):

				ReusaxCorp.printAllEmployees();

				break;
			case (10):

				// : Exits the program
				System.exit(0);

				break;
			default:

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
