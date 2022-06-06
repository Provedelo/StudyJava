
public class Matematica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 50.0;
		double z = -3.75;
		double a, b, c;
		
		a = Math.sqrt(x);
		b = Math.pow(y, x);
		c = Math.abs(z);
		
		System.out.println("Raiz quadrada: " + a);
		System.out.println("potencia de Y^X: " + b);
		System.out.println("absoluto de c: " + c);
		
		//formula maior exemplo com bhaskara
		
		double delta = Math.pow(y, 2.0) - 4 * x*z;
		double x1 = (-y + Math.sqrt(delta)/ (2.0 * x));
		double x2 = (-y - Math.sqrt(delta)/ (2.0 * x));
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);

	}

}
