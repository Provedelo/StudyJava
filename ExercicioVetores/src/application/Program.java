package application;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho X do vetor: ");
		int vX = sc.nextInt();
		System.out.println("Digite o tamanho Y do vetor: ");
		int vY = sc.nextInt();
		int[][] vetor = new int[vX][vY];
		
		for(int i = 0; i < vX; i++) {
			for (int j = 0; j < vY; j++) {
				System.out.println("\nInsira os valores de " + i + j + " = ");
				vetor[i][j] = sc.nextInt();
			}
		}
		System.out.println("Insira o valor de X desejado: ");
		int valorX = sc.nextInt();
		
		for (int i = 0; i < vX; i++) {
			for (int j = 0; j < vY; j++) {
				if (vetor[i][j] == valorX) {
					System.out.println("Encontrado valor X em: " + i + ","+ j);
					System.out.println("Valor: " + vetor[i][j]);
				}
			}
		}
		for (int i=0; i<vX; i++) {
			for (int j=0; j<vY; j++) {
				if (vetor[i][j] == valorX) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + vetor[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + vetor[i-1][j]);
					}
					if (j < vetor[i].length-1) {
						System.out.println("Right: " + vetor[i][j+1]);
					}
					if (i < vetor.length-1) {
						System.out.println("Down: " + vetor[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
	
}