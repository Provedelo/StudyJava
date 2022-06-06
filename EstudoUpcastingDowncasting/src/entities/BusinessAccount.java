package entities;

public class BusinessAccount extends Account { //extends indica que herda de alguem. A extends B; A herda de B

	private Double loanLimit;
	
	public BusinessAccount() { super(); }

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //Super de super classe, herança.
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	};
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}


//Classe herda atribuiçoes de account e as implementa