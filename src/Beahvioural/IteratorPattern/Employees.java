package Beahvioural.IteratorPattern;

public class Employees {
	
	private String empName;
	private int empAge;

	public Employees(String empName, int empAge) {
		this.empName = empName;
		this.empAge = empAge;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}