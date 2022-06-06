package calculatorIOF;

public class CurrencyConverter {
	
	public static double converter(double ammount,double value) {
		return ammount * value;
	}
	
	public static double IOF(double iof) {
		return iof + (iof * 0.06);
	}
}
