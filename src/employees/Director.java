package employees;

public class Director extends Manager implements EmployeeDefinition{ //MAKE IT EXTEND manager?
	
	private String classification = "Director";

	private static double directorsBenefit; 
	
	private String department; 

	public Director(String id, String employeeName, double grossSalaryinput, String department, String degree) {
		super(id, employeeName, grossSalaryinput, degree);
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
		
		double originalTax = 0.1;
		double lowIncomeTax = 0.2;
		double highIncomeTax = 0.4;
		
		if(this.getGrossSalary() < lowIncome) {//??
<<<<<<< HEAD
			netSalary = (this.getGrossSalary()  - (this.getGrossSalary() * originalTax)); //changed this
			netSalary = ((this.getGrossSalary() + getManagerBonus())) - (((this.getGrossSalary()+getManagerBonus()) * originalTax)); //changed this
>>>>>>> 69841f08c9cdd5990d6a1b96e0aae0b1a870e6ff
		} else if (this.getGrossSalary() >= lowIncome && this.getGrossSalary() < highIncome) {
			netSalary = (this.getGrossSalary() + getManagerBonus()) - (((this.getGrossSalary()+getManagerBonus()) * lowIncomeTax));
		} else {
<<<<<<< HEAD
			double First30 = (lowIncome * 0.8 ) ;
			netSalary = ((this.getGrossSalary() - lowIncome)  * highIncomeTax) +  First30;
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
