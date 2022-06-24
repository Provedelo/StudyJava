package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.OnlinePayment;
import model.services.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Contract data: ");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract Value: ");
		double contractValue = sc.nextDouble();
		System.out.println("Number of installments: ");
		int N = sc.nextInt();
		
		Contract ct = new Contract(date, number, contractValue);
	    
		OnlinePayment op = new OnlinePayment(new Paypal());
		op.processTaxes(ct, N);
		
		System.out.println("Installments");
		for (Installment installs : ct.getInstallment()) {//cada objeto installment installs na lista dentro do contract
		 System.out.println(installs);
		}
		
		sc.close();
	}

}
