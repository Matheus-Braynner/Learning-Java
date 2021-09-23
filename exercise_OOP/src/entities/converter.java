package entities;

public class converter {
public static final double IOF = 0.06;
	
	public static double dollarTax(double value, double quantity) {
		double total = value * quantity;
		return total += total * IOF;
	}

}
