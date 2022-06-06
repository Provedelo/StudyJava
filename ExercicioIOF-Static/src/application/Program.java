package application;

import java.util.Locale;
import java.util.Scanner;
import calculatorIOF.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double ammount = sc.nextDouble();
		double total = CurrencyConverter.converter(ammount, dolPrice);
		//pega valores e passa pra calculadora CurrencyConverter
		
		double iof = CurrencyConverter.IOF(total);
		System.out.println("Amount to be paid in reais = " + iof);
		//Calcula IOF em cima do total e apresenta na tela
		
		sc.close();
	}

}
