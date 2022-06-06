package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product produto = new Product(name, price, quantity);
		
		System.out.println(produto);

		System.out.println("Enter with numbers of products to be added in stock: ");
		int adicional = sc.nextInt();	
		produto.addProducts(adicional);
		System.out.println("Updated products: " + produto.getQuantity() + " Total $: " + produto.getPrice());

		System.out.println("Enter with numbers of products to be removed from stock: ");
		int remover = sc.nextInt();
		produto.removeProducts(remover);
		System.out.println("Updated products: " + produto.getQuantity() + " Total $: " + produto.getPrice());

		sc.close();
	}
}
