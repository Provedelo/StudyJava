package aplicacao;
import java.util.Scanner;
import entidades.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle ();
		Triangle y = new Triangle ();
		
		System.out.println("Digite os 3 numeros do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os 3 numeros do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area X: " + areaX + " Area y: " + areaY);
		
		sc.close();
		}

}
