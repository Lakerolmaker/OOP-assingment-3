package employees;



public class Director extends Manager{ //MAKE IT EXTEND manager?
	//need these attributes??
	private String id;
	private String employeeName;
	private double grossSalary;
	
	private double directorsBenefit; //where do we get it from. its the same for all users so maybe not put it in parameters
	
	private String department; 

	public Director(String id, String employeeName, double grossSalary, String department, String degree, double directorsBenefit) {
		super(id, employeeName, grossSalary, degree);
	
		this.directorsBenefit = directorsBenefit;//???
		this.department = department;
		
	}
	
	public double getDirectorsBenefit() {
		return directorsBenefit;
	}
	
	

	@Override
	public double getNetSalary() {
		
		double netSalary = 0;
		double lowIncome = 30000;
		double highIncome = 50000;
		
		double lowIncomeTax = 0.2;
		double highIncomeTax = 0.4;
		
		if(grossSalary < lowIncome) {
			netSalary = super.getNetSalary();
		} else if (grossSalary >= lowIncome && grossSalary < highIncome) {
			netSalary = grossSalary - (grossSalary * lowIncomeTax);
		} else {
			double remainingGross = grossSalary - lowIncome;
			netSalary = grossSalary - (lowIncome * lowIncomeTax) - (remainingGross * highIncomeTax);
		}
		
		return netSalary;
		
	}
	
	
	

}
