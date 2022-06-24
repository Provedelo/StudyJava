package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalServices () {}
	
	public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice (CarRental carRental) {
		
		long start = carRental.getStart().getTime();
		long finish = carRental.getFinish().getTime();
		
		double time = (double)(finish - start) / 1000 / 60 / 60;
		double basicPayment = 0;
		if (time < 24) {
			basicPayment = Math.ceil(time) * pricePerHour;

		}
		else {
			basicPayment = Math.ceil(time / 24) * pricePerDay;
		}
		double tax = taxService.tax(basicPayment);	
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
