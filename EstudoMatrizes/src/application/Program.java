package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor da matriz: ");
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n]; //instanciacao de matriz nxn 
		
		for (int i=0; i<n; i++) { //correr posiçao i, linha; pode-se trocar n por .lenght
			for (int j=0; j<n; j++) {//correr posiçao j, coluna
				System.out.print(mat[i].toString().valueOf(i) +  mat[j].toString().valueOf(j) + " = "); //mostra localizaçao do vetor
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMain Diagonal:");
		for (int i=0; i<mat.length; i++) { //correr posiçao que seja igual 0x0, 1x1, 2x2 etc... diagonal
				System.out.print(mat[i][i] + " ");
		}
		
		int countNeg = 0;
		for (int i=0; i<mat.length; i++) { //correr posiçao i, linha
			for (int j=0; j<mat[i].length; j++) {//correr posiçao j, coluna
				if(mat[i][j] < 0){
					countNeg ++;
				}
			}
		}
		
		System.out.println("\nNegativos: " + countNeg);
		
		for (int i=0; i<mat.length; i++) { //correr posiçao i, linha
			for (int j=0; j<mat[i].length; j++) {//correr posiçao j, coluna
					System.out.println("\nValores " + mat[i].toString().valueOf(i) + mat[j].toString().valueOf(j) + " = " + mat.toString().valueOf(mat[i][j])); //imprime valores do vetor
				}
			}
		
	}

}