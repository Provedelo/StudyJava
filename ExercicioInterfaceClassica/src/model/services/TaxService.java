package model.services;

public interface TaxService {

	Double taxFee (double amount);
	Double interests(double amount, int months);
}
