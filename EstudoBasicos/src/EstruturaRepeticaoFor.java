import java.util.Scanner;

public class EstruturaRepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		double C, F;
		char resp;
		
		do {
		System.out.println("Digite a temperatura em celsius: ");
		C = sc.nextDouble();
		F = 9.0 * C / 5.0 + 2.0;
		System.out.printf("Equivalente em Fahrenheit: %.2f %n", F);
		System.out.println("Deseja repetir? (s/n)");
		resp = sc.next().charAt(0);
		}while (resp == 's');
		
		sc.close();
	}

}
