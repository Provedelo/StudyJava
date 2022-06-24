package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date duoDate;
	private Double tax;
	
	public Installment () {}

	public Installment(Date duoDate, Double tax) {
		this.duoDate = duoDate;
		this.tax = tax;
	}

	public Date getDuoDate() {
		return duoDate;
	}

	public void setDuoDate(Date duoDate) {
		this.duoDate = duoDate;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Installment [Dates= " + sdf.format(duoDate) + ", Amount= " + String.format("%.2f", tax) + "]";
	}
	
	

}
