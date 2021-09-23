package fundamentosJava;

import java.util.Scanner;

public class calculadoraBasica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operacoes;
		double num1, num2, resultado;
		char continuar = 's';
		
		while (continuar != 'n') {
			System.out.printf("Digite qual opera��o voc� deseja:%n1 - Soma%n2 - Subtra��o%n3 - Multiplica��o%n4 - Divis�o%n5 - Potencia��o%n6 - Raiz quadrada%n");
			operacoes = sc.nextInt();
			switch (operacoes) {
			case 1:
				System.out.printf("Soma:%nDigite o primeiro n�mero: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				num2= sc.nextDouble();
				resultado = num1 + num2;
				System.out.printf("O resultado da soma de %.2f + %.2f � : %.2f%n", num1, num2, resultado);
				break;
			case 2:
				System.out.printf("Subtra��o:%nDigite o primeiro n�mero: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				num2= sc.nextDouble();
				resultado = num1 - num2;
				System.out.printf("O resultado da subtra��o de %.2f - %.2f � : %.2f%n", num1, num2, resultado);
				break;
			case 3:
				System.out.printf("Multiplica��o:%nDigite o primeiro n�mero: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				num2= sc.nextDouble();
				resultado = num1 * num2;
				System.out.printf("O resultado da multiplica��o de %.2f * %.2f � : %.2f%n", num1, num2, resultado);
				break;
			case 4: 
				System.out.printf("Divis�o:%nDigite o primeiro n�mero: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				num2= sc.nextDouble();
				resultado = num1 / num2;
				System.out.printf("O resultado da divis�o de %.2f / %.2f � : %.2f%n", num1, num2, resultado);
				break;
			case 5:
				System.out.printf("Potencia��o:%nDigite o n�mero da base: ");
				num1 = sc.nextDouble();
				System.out.print("Digite o n�mero do expoente: ");
				num2= sc.nextDouble();
				resultado = Math.pow(num1, num2);
				System.out.printf("O resultado da potencia��o de %.2f elevado a %.2f � : %.2f%n", num1, num2, resultado);
				break;
			case 6: 
				System.out.printf("Raiz quadrada:%nDigite o n�mero da raiz: ");
				num1 = sc.nextDouble();
				resultado = Math.sqrt(num1);
				System.out.printf("O resultado da raiz quadrada de %.2f �: %.2f%n", num1, resultado);
				break;
				default:
					System.out.println("Digite um n�mero v�lido");
			}
			System.out.println("Deseja continuar ? (s/n)");
			continuar = sc.next().charAt(0);
		}
		System.out.println("Fim.");
		
		sc.close();
	}

}
