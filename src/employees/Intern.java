package employees;

public class Intern extends Employee implements EmployeeDefinition{
	// NEED?? VVVV
	private String id;
	private String employeeName;
	private double grossSalary;

	private double newGrossSalary;
	
	private String classification = "Intern";

	private int gpa;

	public Intern(String id, String employeeName, double grossSalary, int gpa, String classification) {
		super(id, employeeName, grossSalary, classification);

		this.gpa = gpa;
		
		this.classification = classification;
		this.newGrossSalary = getGrossSalary(); //??

	}
	
	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public double getGrossSalary() {
		if (gpa <= 5) { // have this.getgpa() instead?
			newGrossSalary = 0; 
			return newGrossSalary;
		} else if (gpa > 5 && gpa < 8) {
			newGrossSalary = grossSalary;
			return newGrossSalary;
		} else if (gpa >= 8) {
			int bonus = 1000;
			newGrossSalary = grossSalary + bonus;
			return newGrossSalary;
		} else {
			System.out.println("That is not a valid gpa");
			return 0; //?????
		}

	}

	@Override
	public double getNetSalary() {

		double netSalary = this.getGrossSalary(); //??

		return netSalary;
	}
}
