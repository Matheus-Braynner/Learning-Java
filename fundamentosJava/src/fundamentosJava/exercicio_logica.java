package fundamentosJava;

import java.util.Scanner;

public class exercicio_logica {

	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite dois valores para ser somado: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		sc.close();
			soma = (num1 + num2);
			System.out.println("O resultado é: " + soma);
	}

}
