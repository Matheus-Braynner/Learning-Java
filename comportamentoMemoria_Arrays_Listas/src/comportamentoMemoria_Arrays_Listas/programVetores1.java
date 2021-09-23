package comportamentoMemoria_Arrays_Listas;

import java.util.Locale;
import java.util.Scanner;

public class programVetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double s = 0.0;
		for (int i = 0; i < n; i++) {
			s += vect[i];
		}
		double avg = s / n;
		System.out.printf("AVERAGE HEIGHT : %.2f", avg);

		sc.close();

	}

}
