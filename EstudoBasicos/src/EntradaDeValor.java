import java.util.Scanner;

public class EntradaDeValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Teste de input");
		
		Scanner sc = new Scanner (System.in);
		
		/* String x ;
		x = sc.next(); //para string
		System.out.println("Teste digitado: " + x);
		
		
		int y ;
		y = sc.nextInt(); //para outros valores é obrigatorio definir o tipo
		System.out.println("Teste digitado: " + y);
		
		double z ;
		z = sc.nextDouble();
		System.out.println("Teste digitado: " + z); */ 
		
		char pegaLetra;
		pegaLetra = sc.next().charAt(1); // pega o segundo input digitada
		System.out.println("Pega letra: " + pegaLetra); 
		
		String s1, s2, s3;
		sc.nextLine(); // Next line para consumir a quebra de linha anterior e funcionar corretamente.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Dados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
	}

}
