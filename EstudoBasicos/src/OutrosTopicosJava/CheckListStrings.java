package OutrosTopicosJava;

import java.util.Scanner;

public class CheckListStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira uma frase:");
		String frase = sc.nextLine();
		System.out.printf("Lower case: %s \n", frase.toLowerCase());
		System.out.printf("Upper case: %s \n", frase.toUpperCase());
		System.out.printf("Trim: %s \n", frase.trim()); //elimina espaços em branco no começo e no fim
		System.out.printf("Recorte: %s \n", frase.substring(0, 2));
		System.out.printf("Recolocar A por 4: %s \n", frase.replace('a', '4'));
		System.out.printf("Index da posição da letra A : %s \n", frase.indexOf("a"));
		System.out.printf("Corte: %s \n", frase.split("")); //separa a frase a cada espaço em branco
		sc.close();
	}

}
