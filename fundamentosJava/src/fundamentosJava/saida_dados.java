package fundamentosJava;

import java.util.Locale;

public class saida_dados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, wich price is $ %f%n", product1, price1);
		System.out.println();
		System.out.printf("%s, wich price is $ %f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: ", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places:  %.8f", measure);
		System.out.println();
		System.out.printf("Rouded (Three decimal places): %.3f", measure);
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		

	}

}