package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("Enter the number of employees: ");
		int empNumber = sc.nextInt();
		
		if(empNumber == 0) {
			System.out.println("You inserted 0 number of employee");
		}
		
		for(int i = 1; i <= empNumber; i++) {
			System.out.println("\n Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours worked: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y' ) {
				System.out.print("Insert additional charge: ");
				double addCharge = sc.nextDouble();		
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			}else {
				//Employee emp = new list.add(new Employee(name, hours, valuePerHour));
				//fazendo direto o add sem criar um objeto primeiro.
				list.add(new Employee(name, hours, valuePerHour));
			}
			for(Employee emp : list) {
				if(list.size() == empNumber) {
					System.out.println(emp.toString());
				}	
			}
		}
		sc.close();
	}

}
