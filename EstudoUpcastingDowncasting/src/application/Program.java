package application;
//Explicação de Upcasting e DownCasting e implementando o da HERANÇA
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(1001, "João", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 2000.0, 5000.0);
		
		//UPCASTING
		//Converte Objeto da SUBclasse para SUPERclasse
		Account acc1 = bacc;  //Porque esta atribuindo um objeto de uma subclasse para uma superclasse
		Account acc2 = new BusinessAccount(1003, "Josué", 1000.0, 1500.0);
		Account acc3 = new SavingsAccount(1004, "Augusto", 300.0, 10.0);
		
		
		//DOWNCASTING
		//Converte objeto da SUPERclasse para SUBclasse
		
		//BusinessAccount acc 4 = acc2; //não faz conversão direta, nao natural, necessita casting manual! 
		BusinessAccount acc4 = (BusinessAccount) acc2; //Casting forçado;
		acc4.loan(100.0);
			
		//BusinessAccount acc5 = (BusinessAccount) acc3; // Não converte diretamente de savingaccount para businessaccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("LOAN");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("UPDATE");
		}
		
		sc.close();
	}

}
