package entities;

public class BusinessAccount extends Account { 
	
	private Double loanLimit;
	
	public BusinessAccount() { super(); }

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); 
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
	
	@Override //Metodo de override usando o implemento do saque e adicionando mais funcionalidade em cima do original com SUPER
	public void withdraw(double withdraw) {
		super.withdraw(withdraw); //super pega o metodo normal da classe. O saque normal no caso
		this.balance -= 2.0;
	}
}
