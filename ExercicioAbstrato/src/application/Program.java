package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.println("Enter the number of tax payers: ");
		int tp = sc.nextInt();

		for (int i = 1; i <= tp; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.println("Individual or company (i/c) ");
			char type = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Annual income: ");
			double aIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.println("Health expenditures: ");
				double he = sc.nextDouble();
				list.add(new Individual(name, aIncome, he));
			}else if (type == 'c') {
				System.out.println("Number of employees: ");
				int ne = sc.nextInt();
				list.add(new Company(name, aIncome, ne));
			}else System.out.println("Unknow type!");
		}
		
		for(TaxPayer payers : list) {
			System.out.println(payers.getName() +": $" +payers.tax());
		}
	
		sc.close();

	}

}
