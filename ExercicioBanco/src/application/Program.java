package application;

import java.util.Scanner;

import entities.account;

public class Program {

	public static void main(String[] args) {
		String name = null;
		int acNumber = 0;
		double deposit;
		double withdraw;
		String getLetter;
		
		Scanner sc = new Scanner (System.in);
		account ac = new account(acNumber, name);
				
		System.out.println("Enter account number: ");
		acNumber = sc.nextInt();
		ac.setAccount(acNumber);
		
		System.out.printf("Enter accout name:\n");
		sc.nextLine();
		name = sc.nextLine();
		ac.setAcHolder(name);
		
		System.out.println("Is there an initial deposit (y/n)? ");
		
		getLetter = sc.nextLine().toLowerCase();
		if (getLetter.charAt(0) == 'y' ) { //pegando primeira letra da string para comparar
			System.out.println("Insert deposit value: ");
			deposit = sc.nextDouble();
			ac.deposit(deposit);
		}else ac.deposit(deposit = 0);
		
		System.out.println("Account data \n Account: " + ac.getAccount() + ", Holder: " + ac.getAcHolder() + ", Balance: " + ac.getWallet());
		
		System.out.println("To deposit press D, to withdraw press W?");
		sc.nextLine();
		getLetter = sc.nextLine().toLowerCase();
		//getLetter = sc.nextLine().toLowerCase().charAt(0); // se fosse usado CHAR ao inves de STRING
		
		switch(getLetter.charAt(0)) { //usando string e convertendo a primeira letra para CHAR para usar no switch
			case 'd':
				System.out.println("Insert a value to deposit: ");
				deposit = sc.nextDouble();
				ac.deposit(deposit);
				break;
			case 'w':
				System.out.println("Insert a value to withdraw: ");
				withdraw = sc.nextDouble();
				ac.withdraw(withdraw);
				break;
			default:
				System.out.println("Invalid Operation!");
				break;
		}
		System.out.println("Updated data \n Account: " + ac.getAccount() + ", Holder: " + ac.getAcHolder() + ", Balance: " + ac.getWallet());
		sc.close();
	}
}
