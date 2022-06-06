package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int array = 0;
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.println("How many employees will be insert on the system? ");
		array = sc.nextInt();
		
		for(int i = 0; i < array; i++) {
			System.out.println("Employee #"+ (i+1));
			System.out.println("Please insert id: ");
			int id = sc.nextInt();
			System.out.println("Please insert name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Please insert employee salary");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
			}
				
		System.out.println();
		System.out.println("What employee ID will have salary increase?" );
		int idSalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);//filtro de lista para stream que aceita funçao lambda e faz o filtro
		
		//Integer pos = position(list, idSalary); //Posição de procura manual!
		
		if (emp == null) { // <- trocar emp para pos para funcionar com busca manualg
			System.out.println("Checkout ID Again!");
		}else if (emp != null){ // <- trocar emp para pos
			System.out.println("Enter percentage to be increased: ");
			double percent = sc.nextDouble();
			emp.upgradeSalary(percent);
			//list.get(pos).upgradeSalary(percent); // trocado list.get por emp.get
		}
		
		System.out.println("\nList of employees:");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).toString());
		}
		
		System.out.println("\nSecond way to prin employees list!:");
		for(Employee emp1 : list) {
			System.out.println(emp1);
		}
		
		sc.close();
	}

	public static Integer position(List<Employee> list, Integer id) {
		if(id == 0 || id > list.size()) {
			System.out.println("No ID Found! Or do not exist!");
		}else {
			for (int i=0; i <= list.size(); i++) { //percorrendo manualmente a lista e ver o ID
				if (list.get(i).getId() == id)
					return i;
			}
		}return null;
	}
	

}