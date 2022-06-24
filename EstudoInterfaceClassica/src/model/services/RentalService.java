package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice (CarRental carRental) {
		
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		
		double hours =(double)(t2 - t1) / 1000 / 60 / 60; //convert to seconds, minutes and hours
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax)); //create a new object of Invoice and associate to carRental 
	}
}

//Para fazer forte acoplamento, basta remover sobrecarga de metodo no construtor, e, inicializar direto
// this.taxService = new BrazilTaxService(); assim gerando novamente um forte acoplamento.