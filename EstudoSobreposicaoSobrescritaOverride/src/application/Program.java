package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account(1, "Jaum", 100.0);
		acc1.withdraw(5.0);		
		System.out.println("saque conta normal com desconto " + acc1.getBalance());
		
		Account sacc = new SavingsAccount(2, "maria", 100.0, 0.0);
		sacc.withdraw(5.0);
		System.out.println("saque da poupança sem desconto " + sacc.getBalance());
		
		Account bacc = new BusinessAccount(3, "Jose", 100.0, 0.0);
		bacc.withdraw(5.0);
		System.out.println("Saque normal + override da conta empresarial " + bacc.getBalance());
	}
}