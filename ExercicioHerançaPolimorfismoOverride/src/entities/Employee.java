package entities;

public class Employee {
	
	private String name;
	private Integer hour;
	private Double valuePerHour;
	
	public Employee() {}
	
	public Employee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	protected Double payment(){
		return this.hour * this.valuePerHour;	
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", payment= " + payment() + "]";
	}
	
	
}
