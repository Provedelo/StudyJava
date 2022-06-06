package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Rectangle or Circle (r/c): ");
			char c =  sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase()); //SEMPRE SE LEMBRAR DE IMPLEMENTAR ASSIM E NAO COM STRING
			if(c == 'r') {
				System.out.println("Insert width: ");
				double w = sc.nextDouble();
				System.out.println("Insert height: ");
				double h = sc.nextDouble();
				list.add(new Rectangle(color, w, h));
			}else if (c == 'c') {
				System.out.println("Insert Radio: ");
				double rad = sc.nextDouble();
				list.add(new Circle(color, rad));
			}
		}
		for (Shape shape : list) {
			System.out.println(shape.area());
			System.out.println(shape.getColor());
		}
		sc.close();
	}
}
