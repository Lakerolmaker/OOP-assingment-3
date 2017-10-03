package employees;



public class Director extends Manager implements EmployeeDefinition{ //MAKE IT EXTEND manager?
	//need these attributes??
	private String id;
	private String employeeName;
	private double grossSalary;
	
	private double newGrossSalary;
	
	//: So it´s the same
	private static double directorsBenefit; //where do we get it from. its the same for all users so maybe not put it in parameters
	
	private String department; 
	
	private String classification = "Director";

<<<<<<< HEAD
	public Director(String id, String employeeName, double grossSalary, String department, String degree) {
		super(id, employeeName, grossSalary, degree);
=======
	public Director(String id, String employeeName, double grossSalary, String department, String degree, double directorsBenefit, String classification) {
		super(id, employeeName, grossSalary, degree, classification);
>>>>>>> b7cec3dc9a1f9d7521876cff1900211cd7522aaa
		
		this.newGrossSalary = grossSalary ; 
		this.department = department;
		
		this.classification = classification;
	}
	
	public double getDirectorsBenefit() {
		return directorsBenefit;
	}
	
	public double setDirectorsBenefit(double directorsBenefits) {
		directorsBenefit = directorsBenefits;
		return directorsBenefit;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) { //SHOULD WE HAVE THIS?
		this.department = department;
	}
	
	@Override
	public double getGrossSalary() {
		return newGrossSalary + directorsBenefit;
	}

	@Override
	public double getNetSalary() {
		
		double netSalary = 0;
		double lowIncome = 30000;
		double highIncome = 50000;
		
		double lowIncomeTax = 0.2;
		double highIncomeTax = 0.4;
		
		if(newGrossSalary < lowIncome) {//??
			netSalary = super.getNetSalary();
		} else if (newGrossSalary >= lowIncome && newGrossSalary < highIncome) {
			netSalary = newGrossSalary - (newGrossSalary * lowIncomeTax);
		} else {
			double remainingGross = newGrossSalary - lowIncome;
			netSalary = newGrossSalary - (lowIncome * lowIncomeTax) - (remainingGross * highIncomeTax);
		}
		
		return netSalary;
		
	}
	



	

}
