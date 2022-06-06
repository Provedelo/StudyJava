package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Please insert your name: ");
		String name = sc.nextLine();
		System.out.println("Please insert your email: ");
		String email = sc.nextLine();
		System.out.println("Please insert your birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.println("Status: ");
		OrderStatus os = OrderStatus.valueOf(sc.next().toUpperCase());
		System.out.println("How many itens  to this order?");
		
		Order order = new Order(new Date(), os, client);
		
		int n = sc.nextInt();
		if (n != 0 ) {
			for ( int i = 1; i <= n; i++) {
				System.out.println("Item #"+i);
				System.out.println("Product name: ");
				sc.nextLine(); 								//consum buffer
				String itemName = sc.nextLine();
				System.out.println("Product price: ");
				double itemPrice = sc.nextDouble();
				System.out.println("Product quantity: ");
				int itemQuantity = sc.nextInt();
				
				Product product = new Product(itemName, itemPrice);
				OrderItem item = new OrderItem(itemQuantity, itemPrice, product);
				order.addItem(item);		
		} }
		System.out.println(order);
		sc.close();
	}

}
