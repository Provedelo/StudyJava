package OutrosTopicosJava;

import java.util.Scanner;

public class OpBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 89;
		int n2 = 60;
		System.out.println( n1 & n2);
		System.out.println( n1 | n2);
		System.out.println( n1 ^ n2); //comparador logico, aplicavel a programaçao mais baixo nivel
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira o valor de teste");
		int n = sc.nextInt();
		// int mask = 32; //porque o sexto bit dele é zero 0010 0000
		int mask = 0b00100000; //0b indica binário, da pra por notaçao assim ou inteiro
		
		if ((n & mask) != 0) {
			System.out.println("6 bit é true!");
			
		}else {
			System.out.println("6 bit é false!");
		}
		sc.close();
	}

}
