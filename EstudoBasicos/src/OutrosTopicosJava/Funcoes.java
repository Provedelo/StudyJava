package OutrosTopicosJava;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite 3 numeros inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult (higher);
		
		sc.close();
	}

	public static int max (int x, int y, int z) { //int pois retorna valor int
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if (y > x && y > z) {
			aux = y;
		}else {
			aux = z;
		}return aux; //o que a funçao retorna, valor do aux.
			
	}
		
	public static void showResult(int value) { //void pq nao retorna valor
		System.out.println("Higher: " + value);
	}
}
