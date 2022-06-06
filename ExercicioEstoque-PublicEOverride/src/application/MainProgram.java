package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Products produto = new Products ();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextInt();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		System.out.println(produto);
		
		System.out.println("Enter with numbers of products to be added in stock: ");
		int adicional = sc.nextInt();
		produto.addProducts(adicional);
		System.out.println("Updated products: " + produto.quantity + " Total $: " + produto.price);
		
		System.out.println("Enter with numbers of products to be removed from stock: ");
		int remover = sc.nextInt();
		produto.removeProducts(remover);
		System.out.println("Updated products: " + produto.quantity + " Total $: " + produto.price);

		
		sc.close();
	}

}
