package application;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o tam do vetor:");
		int n = sc.nextInt();
		double[] vect = new double[n];
		System.out.println("Insira os valores do vetor");
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		double soma = 0;
		for (int i = 0; i<n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		System.out.println("media " + avg);
		sc.close();
	}

}
