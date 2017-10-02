import java.awt.List;
import java.util.ArrayList;

public class ReusaxCorp {

	private static ArrayList<employee> comanyEmplyee = new ArrayList<employee>();
	
	
	public static void registerEmployee(employee newRecruit) {

		comanyEmplyee.add(newRecruit);
		
	}
	
	public static void removeEmployee(String id) {
		
	}
	
	public static void getEmpoyee(String id) {
		
	}
	
	public static void updateEmployee(String id) {
		
	}
	
	public static void getTotallExpences(String id) {
		
	}
	
	public static void printEmplyee(String id) {
		
	}
	
	public static void printAllEmployees() {
		
		
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
	
	public static void setDirecotrBenefits() {
		
	}
	
	public static void getNumberOfEmployees() {
		
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
