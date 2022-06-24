package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class OnlinePayment {
	
	//private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private TaxService taxService; //interface declarada
	
	public OnlinePayment(TaxService taxService) { 
		this.taxService = taxService;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processTaxes (Contract contract, int months) {
		
		double basicQuote = contract.getTotalValue() / months; // valor total dividido pelas parcelas
		
		for (int i =1; i <= months; i++) {
			double updatedQuote = basicQuote + taxService.interests(basicQuote, i);
			double totalQuote = updatedQuote + taxService.taxFee(updatedQuote);
			Date dueDate = addMonth(contract.getMonth(), i);    //pega a data do contrato e adiciona os meses pelo metodo addmonths                 
			contract.getInstallment().add(new Installment(dueDate, totalQuote));
			//getInstallement acessa a lista, .add pra add objeto, com uma
			//nova instancia (com os meses e o total da divida)
		}		
	}
	
	private Date addMonth(Date date, int num) { //add numero meses a uma data
		//Para trabalhar com Date tem que instaciar caledario Calendar
		Calendar cal = Calendar.getInstance(); //instanciado
		cal.setTime(date); 					   //pega o date passado
		cal.add(Calendar.MONTH, num);		   //adiciona numeros passados para os meses nesse caso
		return cal.getTime();				   //volta a ser um date	
		
	}
	
	/*public Integer numberParcels(Date date) {
		Contract ct = new Contract();
		sdf.format(ct.getMonth());
		String[] month = sdf.toString().split("/");
		int numberOfMonth = Integer.parseInt(month[1]);
		return numberOfMonth;
	}*/
}
