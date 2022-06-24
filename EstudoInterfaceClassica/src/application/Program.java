package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalService;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter retal data");
		System.out.print("Enter Car Model:");
		String carModel = sc.nextLine();
		Date start = null;
		Date finish = null;
		
		try {
			System.out.println("Pickup day (dd/MM/yyyy HH:ss)");
			start = sdf.parse(sc.nextLine());
			System.out.println("Pickup day (dd/MM/yyyy HH:ss)");
			finish = sdf.parse(sc.nextLine());
		} catch (ParseException e) {
			System.out.println("Error at time" + e.getMessage());
		}

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		System.out.print("Enter price per hour: ");
		double priceHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double priceDay = sc.nextDouble();
		
		RentalService rs = new RentalService(priceDay, priceHour, new BrazilTaxServices());
		rs.processInvoice(cr);
		
		System.out.println("Invoice");
		System.out.println("Basic Payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		
		sc.close();
	}
}