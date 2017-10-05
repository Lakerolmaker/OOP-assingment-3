package employees;

public class Director extends Manager implements EmployeeDefinition{ //MAKE IT EXTEND manager?
	//need these attributes??
	private double newGrossSalary =  super.getGrossSalary() + directorsBenefit;
	private String classification = "Director";
	
	//: So it´s the same
	private static double directorsBenefit; //where do we get it from. its the same for all users so maybe not put it in parameters
	
	private String department; 

	public Director(String id, String employeeName, double grossSalary, String department, String degree) {
		super(id, employeeName, grossSalary, degree);
		
	//	this.newGrossSalary; 
		this.department = department;
		
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
	
	public void setDepartment(String department) { 
		this.department = department;
	}
	
	@Override
	public double getGrossSalary() {
		return newGrossSalary;
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
	
//	public double getNewGrossSalary() {
//		return newGrossSalary;
//	}
	
	@Override
	public String getClassification() {
		return this.classification;
	}

	@Override
	public String toString() {
		return "Director ID: " + super.getId() + ", Name: " + super.getEmployeeName() + ", Gross salary with bonus: " + this.getGrossSalary() + ", Classification: " + this.classification + ", Degree: "+ super.getDegree()+", Department: "
				+ this.department;
	}

	

	
	

}
