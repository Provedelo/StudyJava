package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("***Insert names!***");
		method1();
		System.out.println("\nend of program");

	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");

	}

	public static void method2() { // cria-se um metodo para os try and catch
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" "); // ler os dados na linha separados por espaço em branco e cada
														// palavra vai ser uma var na posiçao do vetor
			int pos = sc.nextInt();
			System.out.printf("Result: " +vect[pos]+"\n");
		} catch (ArrayIndexOutOfBoundsException e) { // o "e" é o apelido, pode ser outro nome
			System.out.println("Invalid position");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
			e.printStackTrace();
		}
		System.out.println("***METHOD2 END***");
		sc.close();
	}
}