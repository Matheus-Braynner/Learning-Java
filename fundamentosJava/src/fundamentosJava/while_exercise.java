package fundamentosJava;

import java.util.Scanner;

public class while_exercise {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int senha = sc.nextInt();
		 * 
		 * while (senha != 2002) { System.out.println("Senha inválida"); senha =
		 * sc.nextInt(); }
		 * 
		 * System.out.print("Acesso permitido"); sc.close();
		 * 
		 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); int y =
		 * sc.nextInt();
		 * 
		 * while (x != 0 & y != 0) { if (x > 0 && y > 0) {
		 * System.out.println("Primeiro quadrante"); } else if (x < 0 && y > 0) {
		 * System.out.println("Segundo quadrante"); } else if (x < 0 && y < 0) {
		 * System.out.println("Terceiro quadrante"); } else if (x > 0 && y < 0) {
		 * System.out.println("Quarto quadrante"); } else { System.out.println(""); } x
		 * = sc.nextInt(); y = sc.nextInt(); }
		 * 
		 * sc.close();
		 */

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			} else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

}
