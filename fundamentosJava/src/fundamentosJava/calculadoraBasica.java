package fundamentosJava;

import java.util.Scanner;

public class calculadoraBasica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operacoes;
		double num1, num2, resultado;
		char continuar = 's';
		
		while (continuar != 'n') {
			System.out.printf("Digite qual operação você deseja:%n1 - Soma%n2 - Subtração%n3 - Multiplicação%n4 - Divisão%n5 - Potenciação%n6 - Raiz quadrada%n");
			operacoes = sc.nextInt();
			switch (operacoes) {
			case 1:
				System.out.printf("Soma:%nDigite o primeiro número: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2= sc.nextDouble();
				resultado = num1 + num2;
				System.out.printf("O resultado da soma de %.2f + %.2f é : %.2f%n", num1, num2, resultado);
				break;
			case 2:
				System.out.printf("Subtração:%nDigite o primeiro número: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2= sc.nextDouble();
				resultado = num1 - num2;
				System.out.printf("O resultado da subtração de %.2f - %.2f é : %.2f%n", num1, num2, resultado);
				break;
			case 3:
				System.out.printf("Multiplicação:%nDigite o primeiro número: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2= sc.nextDouble();
				resultado = num1 * num2;
				System.out.printf("O resultado da multiplicação de %.2f * %.2f é : %.2f%n", num1, num2, resultado);
				break;
			case 4: 
				System.out.printf("Divisão:%nDigite o primeiro número: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				num2= sc.nextDouble();
				resultado = num1 / num2;
				System.out.printf("O resultado da divisão de %.2f / %.2f é : %.2f%n", num1, num2, resultado);
				break;
			case 5:
				System.out.printf("Potenciação:%nDigite o número da base: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o número do expoente: ");
				num2= sc.nextDouble();
				resultado = Math.pow(num1, num2);
				System.out.printf("O resultado da potenciação de %.2f elevado a %.2f é : %.2f%n", num1, num2, resultado);
				break;
			case 6: 
				System.out.printf("Raiz quadrada:%nDigite o número da raiz: ");
				num1 = sc.nextDouble();
				resultado = Math.sqrt(num1);
				System.out.printf("O resultado da raiz quadrada de %.2f é: %.2f%n", num1, resultado);
				break;
				default:
					System.out.println("Digite um número válido");
			}
			System.out.println("Deseja continuar ? (s/n)");
			continuar = sc.next().charAt(0);
		}
		System.out.println("Fim.");
		
		sc.close();
	}

}
