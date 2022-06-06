import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Condicionais, comparativas e booleanos");
		
		//Exemplo da hora
		System.out.println("Digite um valor de 0 a 24 horas");
		Scanner sc1 = new Scanner(System.in);
		double hora;
		hora = sc1.nextDouble();
		
		if (hora >= 0.0 && hora < 5.0  || hora == 24) 
		{
			System.out.println("Madrugada");
		}else if (hora >= 5.0 && hora <= 12.0) 
			{
			System.out.println("Manhã");
			}else if (hora > 12.0 && hora <= 18.0) 
				{
				System.out.println("Tarde");
				}else if (hora > 18.0 && hora <= 23.59) 
					{
					System.out.println("Noite");
					}else System.out.println("Hora Inválida");
		
		//Exemplo telefonia
		int minutos;
		int saldo = 50;
		System.out.println("\n Insira os minutos utilizados: ");
		Scanner sc2 = new Scanner(System.in);
		minutos = sc2.nextInt();
					
		if (minutos <= 100){
			System.out.println("Valor do saldo R$: " + saldo);
		}else{
			saldo = ((minutos - 100) * 2) + saldo;
			System.out.printf("Total do saldo R$: %d", saldo);
			}
		
		
		//Dias da semana
		
		System.out.println("Digite um dia da semana de 1 a 7");
		Scanner sc3 = new Scanner(System.in);
		int x = sc3.nextInt();
		String dia;
		
		switch (x){
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terça";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default:
				dia = "Valor invalido";
				break;
		}
		System.out.println("Dia: " + dia);		
		sc3.close();
		sc2.close();
		sc1.close();
	}

}
