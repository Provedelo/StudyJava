package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product (String name, double price, int quantity) { //Construtor
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) { //metodos get e set vem depois do construtor
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	/*public void setQuantity(int quantity) { //a quantidade so pode ser alterada qndo insere ou remove itens para proteger o produto, a consistencia dele via somente entrada e saida
		this.quantity = quantity;
	}*/
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // comando this faz receber refencia ao atributo, nao ao parametro do metodo
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { // override da funçao toString
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total $ "
				+ (String.format("%.2f", totalValueInStock()));
	}
}
