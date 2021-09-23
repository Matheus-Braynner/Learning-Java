package fundamentosJava;

import java.util.Scanner;

public class exerciciofor2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  
		  int x = sc.nextInt();
		  for (int i = 0; i <= x; i++)
		  { if (i % 2 != 0)
		  System.out.println(i); }
		  
		  sc.close();
		 

		/*
		 * Exercicio 2 FEITO POR MIM
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int x = sc.nextInt(); for (int i = 0; i < x; i++) { int y = sc.nextInt(); if
		 * (y >= 10 && y <=20) { System.out.println(y + " In"); } else {
		 * System.out.println(y + " out"); } }
		 * 
		 * sc.close();
		 *
		 *
		 * 
		 * 
		 * Exercicio 2 RESOLUÇÃO
		 *
		 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); int in = 0; int
		 * out = 0; for (int i = 0; i < x; i++) { int y = sc.nextInt(); if (y >= 10 && y
		 * <=20) { in = in + 1; } else { out = out + 1; } }
		 * 
		 * System.out.println(in + " in"); System.out.println(out + " out");
		 * 
		 * sc.close();
		 

		
		 * Exercicio 3
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * double a = sc.nextDouble(); double b = sc.nextDouble(); double c =
		 * sc.nextDouble();
		 * 
		 * double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		 * 
		 * System.out.printf("%.1f%n", media); }
		 * 
		 * sc.close();
		 * 
		 */

	}

}
