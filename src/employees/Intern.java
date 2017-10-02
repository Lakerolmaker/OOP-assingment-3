package employees;

public class Intern extends Employee{
	//NEED?? VVVV
	private String id;
	private String employeeName;
	private double grossSalary;
	
	private int gpa;
	
	public Intern(String id, String employeeName, double grossSalary, int gpa) {
		super(id, employeeName, grossSalary);
		
		this.gpa = gpa;
	
	}
	
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public double getGrossSalary() {
		if(gpa >= 0 && gpa <= 10){
			if(gpa <= 5) {
				grossSalary = 0; //??
			}
			if(gpa  > 5 && gpa < 8) {
				grossSalary = grossSalary;
			}
			if(gpa >= 8) {
				int bonus = 1000;
				grossSalary = grossSalary + bonus;
			}
		}
		return grossSalary;
	}

	@Override
	public double getNetSalary() {
		
		//DONT NEED FOR INTERN MAYBE
		
		return super.getNetSalary();
	}

}
