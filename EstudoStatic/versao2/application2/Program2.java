package application2;
//metodos comuns instanciados em outras classes e chamado na classe principal do programa
import java.util.Locale;
import java.util.Scanner;

import utils2.Calculadora2;

public class Program2 {
	

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora2 calc = new Calculadora2(); // a instancia pra chamar as referencias
		
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circum(raio);
		
		double v = calc.volume(raio);
		
		System.out.printf("Circumferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("Pi: %.2f\n", calc.PI);
		
		sc.close();
	}


}
