import java.util.Scanner;

import employees.*;

public class main {

	public static void main(String[] args) {
		
		

        Scanner sc=new Scanner(System.in);

      
        menu.printLogo();
        
        //: While-loop that keeps the progrm running forever.
        while(true) {
        	
            //: Dispalys the menu
            System.out.print(""+
    				" ------------------------------------------ "	+ "\n" +
    				" |                 Menu                   | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 1 to register an employee        | "   + "\n" +
    				" |--------------------------------------- | "	+ "\n" +
    				" | Press 2 to print all employee          | "   + "\n" +
    				" |--------------------------------------- | "	+ "\n" +
    				" | Press 3 to print a specified emplyee   | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 4 to remove an employee          | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 5 to update an employee          | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 6 to set director benefits       | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 7 to print totall expenses       | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" | Press 10 to quit the program           | "   + "\n" +
    				" ---------------------------------------- | "	+ "\n" +
    				" Input a choice : ");


            //: Gets the user input, with some fail safes
            Scanner menuScanner = new Scanner(System.in);
			int input = 0;
			try {
				input = menuScanner.nextInt();
			}catch(Exception e) {}
		
			switch(input) {

			case(1):
								
				System.out.println("Enter the position of the employee: (Available: Regular, Inter, Manager, Director.");
				String employeePosition = sc.next();
				if(employeePosition.equals("Regular")) {
					
					System.out.print("Enter the ID of the new regular employee: ");
					String eompoyeeId = sc.next();
					Employee createdEmpoyee = new Employee(eompoyeeId, "", 0.0);

					System.out.print("Enter the name of the regular employee: ");
					String employeeName = sc.next();
					createdEmpoyee.setEmployeeName(employeeName);

					System.out.print("Enter the gross salary of the regular employee: ");
					double employeesalary = sc.nextDouble();
					createdEmpoyee.setGrossSalary(employeesalary);

					ReusaxCorp.registerEmployee(createdEmpoyee);

					
				}else if(employeePosition.equals("Intern")) {
					
					System.out.print("Enter the ID of the new intern: ");
					String eompoyeeId = sc.next();
					Intern createdEmpoyee = new Intern(eompoyeeId, "", 0.0, 0);

					System.out.print("Enter the name of the new intern: ");
					String employeeName = sc.next();
					createdEmpoyee.setEmployeeName(employeeName);

					System.out.print("Enter the gross salary of the new intern: ");
					double employeesalary = sc.nextDouble();
					createdEmpoyee.setGrossSalary(employeesalary);
					
					System.out.print("Enter the GPA of the new intern: ");
					int gpa = sc.nextInt();
					createdEmpoyee.setGpa(gpa); //KAN INTE GÖRA DETTA OM VI SKAPAR ETT INTERNOBJECT MED EMPLOYEE REFERENCE D:

					ReusaxCorp.registerEmployee(createdEmpoyee);
					
				}else if(employeePosition.equals("Manager")) {
					System.out.print("Enter the ID of the new manager: ");
					String eompoyeeId = sc.next();
					Manager createdEmpoyee = new Manager(eompoyeeId, "", 0.0, "");

					System.out.print("Enter the name of the new manager: ");
					String employeeName = sc.next();
					createdEmpoyee.setEmployeeName(employeeName);

					System.out.print("Enter the gross salary of the new manager: ");
					double employeesalary = sc.nextDouble();
					createdEmpoyee.setGrossSalary(employeesalary);
					
					System.out.print("Enter the degree of the new manager: ");
					String degree = sc.next();
					createdEmpoyee.setDegree(degree);

					ReusaxCorp.registerEmployee(createdEmpoyee); //WHAT TO DO WITH THESE??
					
				}else if(employeePosition.equals("Director")) {
					System.out.print("Enter the ID of the new director: ");
					String eompoyeeId = sc.next();
					Director createdEmpoyee = new Director(eompoyeeId, "", 0.0, "","");

					System.out.print("Enter the name of the new director: ");
					String employeeName = sc.next();
					createdEmpoyee.setEmployeeName(employeeName);

					System.out.print("Enter the gross salary of the new director: ");
					double employeesalary = sc.nextDouble();
					createdEmpoyee.setGrossSalary(employeesalary);
					
					System.out.println("Enter the degree of the new director: "); //I CHANGED THE ORDER FOR DEGREE AND DEPARTMENT
					String degree = sc.next();
					createdEmpoyee.setDegree(degree);
					
					System.out.println("Enter the department of the new director: (Available: Technical, Human resources, Business ");		
					String department = sc.next();
					createdEmpoyee.setDepartment(department);
					
					ReusaxCorp.registerEmployee(createdEmpoyee);
					
					main.print(
				    	 	" ------------------------------------ "	+ "\n" +
				    	 	" |     Success , emplyee created    | " + "\n" +
				        " ------------------------------------ "	+ "\n" + "\n") ;
				}
				
		
			break;
			case(2):
				
			ReusaxCorp.printAllEmployees();
			
			break;
			case (3):

				//TODO
			

				break;		
			case (4):

				//TODO
			

				break;
			case (5):

				//TODO
			

				break;
			case (6):
				//Set directors benefit
				
			

				break;
			case (7):

				//TODO
			

				break;
			case (8):

				//TODO
			

				break;
			case (9):

				//TODO
			

				break;
			case(10):
			
			//: Exits the program
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
		   for(int i = 0;  i < 100; i++) {
			   print("\n");
		   }  
		}
	
}
