package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; //olhar a ficha pautada pag 57, resumo de protected, public e private
	
	public Account() {}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double withdraw) {
		this.balance -= withdraw;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
}
