package employees;

public class Manager extends Employee{
	//need???
	private String id;
	private String employeeName;
	private double grossSalary;
	
	private String degree;
	
	private double bonus;
	
	public Manager(String id, String employeeName, double grossSalary, String degree) {
		super(id, employeeName, grossSalary);
		
		this.grossSalary = grossSalary + bonus; //????? should the bonus be added to the salary
		
		this.degree = degree;
		this.bonus = getManagerBonus(degree);//????
		
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public double getManagerBonus(String degree) {
		if(degree.equals("BSc.")) {
			bonus = grossSalary * 0.1;
			return bonus;
		}else if(degree.equals("MSc.")) {
			bonus = grossSalary * 0.2;
		}else if(degree.equals("PhD")) {
			bonus = grossSalary * 0.35;
			return bonus;
		}else {
			System.out.println("That's not a valid degree");
			return 0; //=?????
		}
		return 0; //CHANGE THIS
	}

//	@Override
//	public double getNetSalary() {
//		
//		
//		
//		return super.getNetSalary();
//	}

	
	
}
