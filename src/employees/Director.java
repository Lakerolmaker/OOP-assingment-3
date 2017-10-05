package employees;

public class Director extends Manager implements EmployeeDefinition{ //MAKE IT EXTEND manager?
	
	private String classification = "Director";

	private static double directorsBenefit; 
	
	private String department; 

	public Director(String id, String employeeName, double grossSalary, String department, String degree) {
		super(id, employeeName, grossSalary, degree);
		
		this.department = department;
		
	}
	
	public double getDirectorsBenefit() {
		return directorsBenefit;
	}
	
	public void setDirectorsBenefit(double directorsBenefits) {
		directorsBenefit = directorsBenefits;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) { 
		this.department = department;
	}
	
	@Override
	public double getGrossSalary() {
		return super.getGrossSalary() + directorsBenefit;
	}

	@Override
	public double getNetSalary() {
		
		double netSalary = 0;
		double lowIncome = 30000;
		double highIncome = 50000;
		
		double lowIncomeTax = 0.2;
		double highIncomeTax = 0.4;
		
		if(super.getGrossSalary() < lowIncome) {//??
			netSalary = super.getGrossSalary();
		} else if (super.getGrossSalary() >= lowIncome && super.getGrossSalary() < highIncome) {
			netSalary = super.getGrossSalary() - (super.getGrossSalary() * lowIncomeTax);
		} else {
			double remainingGross = super.getGrossSalary() - lowIncome;
			netSalary = super.getGrossSalary() - (lowIncome * lowIncomeTax) - (remainingGross * highIncomeTax);
		}
		
		return netSalary;
		
	}
	
	
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
