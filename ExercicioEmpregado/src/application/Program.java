package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Insert employee name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Insert gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Insert Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + " $" + employee.totalSalary());
		
		System.out.println("Wich percent to increase salary? ");
		double gain = sc.nextDouble();
		employee.increaseSalary(gain); 
		System.out.println("Updated Data: " + employee.name + " $" + employee.liquidSalary);
				
		sc.close();
	}

}
