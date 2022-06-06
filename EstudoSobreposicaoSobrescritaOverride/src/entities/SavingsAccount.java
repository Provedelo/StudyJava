package entities;
//Usando OVERRIDE 
public final class SavingsAccount extends Account{ //Usando FINAL, na classe nao a deixa ser herdada, e, no método nao o deixa ser implementado!
	
	private Double interestRate;

	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance +=  balance * this.interestRate;
	}
	
	@Override //Sobreposição de metodo do Account, agora sem o desconto de saque nesta classe
	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
}
