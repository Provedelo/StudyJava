import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite uma senha: ");
		int pw = sc.nextInt();
		int retry = 0;
		while (pw != retry) {
			System.out.println("Digite a senha novamente: ");
			retry = sc.nextInt();
		}
		System.out.println("Acesso!");
		sc.close();
	}

}
