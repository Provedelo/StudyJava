package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of products: ");
		int prodNum = sc.nextInt();
		
		if(prodNum == 0) {
			System.out.println("You inserted 0 number of products");
		}
		
		for(int i = 1; i <= prodNum; i++) {
			System.out.println("\n Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if(ch == 'c' ) {
				list.add(new Product(name, price));
			}
			else if(ch == 'u' ) {
				System.out.print("Insert Data (dd/mm/yyyy): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}else if (ch == 'i'){
				System.out.println("Insert Customs Fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}else {
				System.out.println("Unknow character");
			}
			for(Product prod : list) {
				if(list.size() == prodNum) {
					System.out.println(prod.priceTag());
				}	
			}
		}
		sc.close();
	}

}