package employees;
//package employees;

public class Employee implements EmployeeDefinition{
	
	private String id;
	private String employeeName;
	private double grossSalary;
	
	
	
	private String classification = "Employee";
	
	public Employee(String id, String employeeName, double grossSalary) {
		this.id = id;
		this.employeeName = employeeName;
		this.grossSalary = grossSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public String getId() {
		return id;
	}
	
	public double getNetSalary() {
		
		double netSalary = grossSalary - (grossSalary * 0.1);
		
		return netSalary;
	}

	@Override
	public String toString() {
		return "Employee id: " + this.id + ", employee name: " + this.employeeName + ", gross salary: " + this.grossSalary;
	}

	@Override
	public String getClassification() {
		
		return this.classification;
	}
	

}
