import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insira o Numero do funcionario, total de horas e valor/hora");
		Scanner sc1 = new Scanner(System.in);
		
		int nmroFuncionario;
		int horaTrabalhada;
		double valorHora;
		
		nmroFuncionario = sc1.nextInt();
		horaTrabalhada = sc1.nextInt();
		valorHora = sc1.nextDouble();
		
		double total = (double)horaTrabalhada * valorHora;
		System.out.println("Numero: " + nmroFuncionario + " Recebe R$: " + total);
		
		
		Scanner sc2 = new Scanner (System.in);
		double base;
		double altura;
		double areaTerreno;
		double valorMetro;
		double total2;
		
		System.out.println("Insira a base, altura e valor do metro do terreno:");
		
		base = sc2.nextDouble();
		altura = sc2.nextDouble();
		valorMetro = sc2.nextDouble();
		
		areaTerreno = base * altura;
		total2 = areaTerreno * valorMetro;
		
		System.out.printf("Area = %.2f \nPreço = %.2f", areaTerreno, total2);
		sc2.close();
		sc1.close();
	}

}
