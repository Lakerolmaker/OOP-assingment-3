package employees;

public class Manager extends Employee implements EmployeeDefinition{
	
	private double grossSalaryPlusBonus;
	
	private String degree;
	
	private double bonus;
	
	private String classification = "Manager";
	
	public Manager(String id, String employeeName, double grossSalary, String degree) {
		super(id, employeeName, grossSalary);
		
		this.degree = degree;
		this.bonus = getManagerBonus();
		this.grossSalaryPlusBonus = grossSalary; 
		
	}

	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
		this.bonus = getManagerBonus();
	}
	
	public double getGrossSalary() {
		return grossSalaryPlusBonus + bonus;
	}
	
	public double getManagerBonus() {
		
		if(degree.equals("bsc")) {
			bonus = super.getGrossSalary() * 0.1;
		}else if(degree.equals("msc")) {
			bonus = super.getGrossSalary() * 0.2;
		}else if(degree.equals("phd")) {
			bonus = super.getGrossSalary() * 0.35;
		}
		return bonus;
	}
	
	@Override
	public String getClassification() {
		return this.classification;
	}

	@Override
	public String toString() {
		return "Manager ID: " + super.getId() + ", Name: " + super.getEmployeeName() + ", Original Gross Salary: " + super.getGrossSalary()
				+ ", Gross Salary after added bonus: " + this.getGrossSalary() + ", Degree: " + this.degree + ", Bonus: " + this.bonus
				+ ", Classification: " + this.classification;
	}
	
	
	

	
	
}
