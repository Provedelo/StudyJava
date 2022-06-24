package entities;

public class Product {

	private String name;
	private Double value;
	private Double quantity;
	
	public Product(String name, Double value, Double quantity) {
		super();
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return quantity * value;
	}
	
}
