package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double liquidSalary;
	public double tax;
	
	public double totalSalary() {
		liquidSalary = grossSalary - tax;
		return liquidSalary;
	}
	
	public void increaseSalary(double gain) {
		liquidSalary += (grossSalary * gain) / 100;
	}
	

}
