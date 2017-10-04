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
		this.grossSalaryPlusBonus = grossSalary + bonus; 
		
	}

	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public double getGrossSalary() {
		return grossSalaryPlusBonus;
	}
	
	public double getManagerBonus() {
		
		if(degree.equals("BSc")) {
			bonus = super.getGrossSalary() * 0.1;
		}else if(degree.equals("MSc")) {
			bonus = super.getGrossSalary() * 0.2;
		}else if(degree.equals("PhD")) {
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
		return "Manager id=" + super.getId() + ", employeeName=" + super.getEmployeeName() + ", grossSalary=" + super.getGrossSalary()
				+ ", grossSalaryPlusBonus=" + this.grossSalaryPlusBonus + ", degree=" + this.degree + ", bonus=" + this.bonus
				+ ", classification=" + this.classification;
	}
	
	
	

	
	
}
