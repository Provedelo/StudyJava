package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Please insert worker derpartment: ");
		String departmentName = sc.nextLine();
		System.out.println("Please insert worker name: ");
		String workerName = sc.nextLine();
		System.out.println("Please insert worker level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Please insert worker base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts this worker had?: ");
		Integer contracts = sc.nextInt();
		if( contracts != null ) {
			for(int i = 1; i <= contracts; i++) {
				System.out.println("Please insert contract " +i+ " data");
				System.out.print("Date (DD/MM/YYYY)\n");
				Date contractDate = sdf.parse(sc.next());
				System.out.println("Please insert value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.println("Please insert Duration (hours): ");
				int hours = sc.nextInt();
				HourContract contract = new HourContract(contractDate, valuePerHour, hours);
				worker.addContract(contract);
			}
		}

		System.out.println(worker);
		
		System.out.println("Enter month and year to calculate income (MM/YYYY) ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name:" + worker.getName() + "\nDepartment: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}
}
