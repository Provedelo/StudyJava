package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId () {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void upgradeSalary (double percent) {
		this.salary += (percent * this.salary) / 100;
	}
	
	public String toString() {
		return id + ", "+name+", "+ String.format("%.2f", salary); 
	}
}
