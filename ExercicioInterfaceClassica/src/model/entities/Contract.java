package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Date month;
	private Integer contractNumber;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<Installment>();

	public Contract() {	}

	public Contract(Date month, Integer contractNumber, Double totalValue) {
		super();
		this.month = month;
		this.contractNumber = contractNumber;
		this.totalValue = totalValue;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public List<Installment> getInstallment() {
		return installments;
	}
	

	
}
