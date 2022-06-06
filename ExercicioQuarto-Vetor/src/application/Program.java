package application;

import java.util.Scanner;

import entities.Residents;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Residents[] res = new Residents[10];
		System.out.println("Insira o numero do quartos a serem alocados: ");
		int n = sc.nextInt();
						
		for(int i=1; i <= n; i++) {
			System.out.println("Insira o nome: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println("Insira o email: ");
			String email = sc.nextLine();
			System.out.println("Insira o numero do quarto desejado: ");
			int room = sc.nextInt();
			res[room] = new Residents(name, email);
			res[room].setRoom(room);
			
		}
		
		for(int i = 1; i < res.length; i++) {
			if (res[i] != null) {
				System.out.println("Pessoa: "+ res[i].getName() + " Email: " + res[i].getEmail() + " Quarto: " + res[i].getRoom());
			}
		}
		
		sc.close();
	}

}
