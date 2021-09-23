package fundamentosJava;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 1.8 * C + 32;
			System.out.printf("Equivalente a Fareheint: %.1f%n", F);
			System.out.print("Deseja repetir (S/N) ?");
			resp = sc.next().charAt(0);
			sc.close();
		} while (resp != 'n');

	}

}
