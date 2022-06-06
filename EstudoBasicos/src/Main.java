import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste");
		Locale.setDefault(Locale.US);
		double x = 1.4467;
		System.out.printf("%.2f %n", x);
		System.out.println ("Valor de X igual=" + x + "concatenação");
		System.out.printf("Valor de X igual= %f ou com duas casas decimais %.2f %n", x, x);
		
		String nome = "Maria";
		int idade = 20;
		double renda = 1200.50;
		System.out.printf("Ela se chama %s, tem idade de %d e ganha %.2f %n", nome, idade, renda);
		
		
	}

}
