package model.services;

public class BrazilTaxServices implements TaxService{

	public double tax (double amount)  {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}

//Sem interface para taxamento, remova implements e alterar classe rental 
//com private BrazilTaxService e nao TaxService


//Com interface para taxamento uso do: implements taxservice