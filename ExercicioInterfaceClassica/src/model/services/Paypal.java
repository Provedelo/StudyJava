package model.services;

public class Paypal implements TaxService {

	public static final double PAYMENT_FEE = 0.02;
	public static final double MONTH_FEE = 0.01;
	
	@Override
	public Double taxFee(double amount) {
		amount = amount * PAYMENT_FEE;
		return amount;
	}

	@Override
	public Double interests(double amount, int months) {
		amount = amount * MONTH_FEE * months;
		return amount;
	}

}
