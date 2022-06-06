package application;

import java.util.Scanner;

import entities.Product;

public class VetorTipoClasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tam do vetor:");
		int nVet = sc.nextInt();
		Product[] vectProd = new Product[nVet];
		
		for (int i=0; i<vectProd.length; i++) { //usando o proprio tam do vetor; Pode-se usar i<vectProd.lengh para n depender de variavel e ficar mais coeso
			sc.next(); //consumir a quebra de linha pendente
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vectProd[i] = new Product(name, price); //salva a cada iteraçao i o nome e o preço do objeto			
		}
		
		double sum = 0;
		for (int i=0 ; i<nVet; i++) { //Usando a variavel para tam do vetor
			sum += vectProd[i].getPrice(); //coleta a soma dos preços dos produtos
		}
		
		double avg = sum / nVet;
		System.out.println(avg);
		
		sc.close();
	}

}
