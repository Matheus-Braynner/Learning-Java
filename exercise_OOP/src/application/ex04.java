package application;

import java.util.Locale;
import java.util.Scanner;
import entities.converter;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dolar price? ");
		double value = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", converter.dollarTax(value, quantity));
		
		sc.close();
	}

}
