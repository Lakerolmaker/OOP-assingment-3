package employees;

import departments.Department;

public class Director extends Manager{ //MAKE IT EXTEND manager instead?
	//need these attributes??
	private String id;
	private String employeeName;
	private double grossSalary;
	
	private Department department; //or make them strings??

	public Director(String id, String employeeName, double grossSalary, Department department, String degree) {
		super(id, employeeName, grossSalary, degree);
	
		this.department = department;
		
	}
	
	public double getDirectorsBenefit() {
		return 0;
	}

	@Override
	public double getNetSalary() {
		
		double netSalary = 0;
		
		if(grossSalary < 30000) {
			netSalary = super.getNetSalary();
		} else if (grossSalary >= 30000 && grossSalary < 50000) {
			netSalary = grossSalary - (grossSalary * 0.2);
		} else {
			double remainingGross = grossSalary - 30000;
			netSalary = grossSalary - (30000 * 0.2) - (remainingGross * 0.4);
		}
		
		return netSalary;
		
	}
	
	

}
