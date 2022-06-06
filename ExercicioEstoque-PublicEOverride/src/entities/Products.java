package entities;

public class Products {
		public String name;
		public double price;
		public int quantity;
		
		public double totalValueInStock () {
			return price * quantity;
		}
		
		public void addProducts (int quantity) {
			this.quantity += quantity; //comando this faz receber refencia ao atributo, nao ao parametro do metodo
		}
		
		public void removeProducts (int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() { //override da funçao toString
			return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total $ "
			+(String.format("%.2f", totalValueInStock()));
		}
}
