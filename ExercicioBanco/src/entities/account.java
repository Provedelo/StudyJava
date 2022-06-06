package entities;

public class account {
	private int account;
	private String acHolder;
	private double wallet;
	
	public account(int account, String acHolder) {
		super();
		this.account = account;
		this.acHolder = acHolder;
	}
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getAcHolder() {
		return acHolder;
	}
	public void setAcHolder(String acHolder) {
		this.acHolder = acHolder;
	}
	public double getWallet() {
		return wallet;
	}
	
	public void withdraw (double value) {
		this.wallet -= value + 5.0; 
	}
	
	public void deposit (double value) {
		this.wallet += value;
	}
}
