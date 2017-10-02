//package employees;

public class employee {
	
	private String id;
	private String employeeName;
	private double grossSalary;
	
	public employee(String id, String employeeName, double grossSalary) {
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
		return "Employee id: " + id + ", employee name: " + employeeName + ", gross salary: " + grossSalary + "]";
	}
	

}