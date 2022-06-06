package application3;

import java.util.Locale;
import java.util.Scanner;

import utils3.Calculadora3;

public class Program3 {
	
//Com metodos e membros estáticos, a chamada é a próprica classe onde se faz as contas
//Basta chamar a classe e o membro a ser utilizado como o Calculadora3.circum
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculadora3.circum(raio); //exemplo onde se chama a propria classe, com metodo estatico, podendo usar os membros independente do objeto 
		
		double v = Calculadora3.volume(raio);
		
		System.out.printf("Circumferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi: %.2f\n", Calculadora3.PI); //Constante estatica
		
		sc.close();
	}


}
