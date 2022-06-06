import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o preço: ");
		Scanner sc = new Scanner (System.in);
		double preco, desconto;
		preco = sc.nextDouble();
		desconto = preco - ((preco <= 20) ? preco * 0.1 : preco * 0.05); //condiçao ternaria no lugar de if-else
		System.out.println("Total:" + desconto);
		sc.close();
	}

}
