package fundamentosJava;

import java.util.Scanner;

public class exercicio_If_Else {

	public static void main(String[] args) {
		/*
		 *  				EXERC�CIO 1
		 * 
		 * Scanner sc = new Scanner(System.in);
		 
			int num;
			System.out.println("Escreva um n�mero, para descobrir se � positivo ou n�o positivo");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("N�o positivo");
			}
		sc.close();
		*/
		
		/*
		 * 
		 * 				EXERC�CIO 2
		 
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite o n�mero, para saber se � par ou �mpar");
		num = sc.nextInt();
		if (num % 2 == 1) {
			System.out.println("N�mero �mpar");
		} else {
			System.out.println("N�mero par1");
		}
		
		sc.close();
		
		*/
		/*
		 * 
		 * 				EXERC�CIO 3
		 
		Scanner sc = new Scanner(System.in);
		int A, B;
		System.out.println("Digite dois n�meros, para descobrir se eles s�o multiplos");
			A = sc.nextInt();
			B = sc.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos");
		} else {
			System.out.println("N�o Multiplos");
		}
		
		sc.close();
		
		*/
		
		/*
		 * 
		 * 				EXERC�CIO 4
		 * 
		Scanner sc = new Scanner(System.in);
		int horarioInicial, horarioFinal, duracao;
		System.out.println("Digite o hor�rio que come�ou a jogar: ");
		horarioInicial = sc.nextInt();
		System.out.println("Digite o hor�rio que terminou de jogar: ");
		horarioFinal = sc.nextInt();
		
		if (horarioInicial < horarioFinal) {
			duracao = horarioFinal - horarioInicial;
		} else {
			duracao = 24 - horarioInicial - horarioFinal;
		}
		System.out.println("O jogo teve uma dura��o de " + duracao + " Horas");
		sc.close();
		*/
		/*
		 * 
		 * 			EXERC�CIO 5
		 * 
		Scanner sc = new Scanner(System.in);
		double item, quantidade, total;
		System.out.println("Coloque o item que voc� quer ( de 1 a 5): ");
		item = sc.nextInt();
		System.out.println("Digite a quantidade do item que voc� quer: ");
		quantidade = sc.nextInt();
		
		if (item == 1) {
			total =  4.00 * quantidade;
		} else if (item == 2) {
			total = 4.50 * quantidade;
		} else if (item == 3) {
			total = 5.00 * quantidade;
		} else if (item == 4) {
			total = 2.00 * quantidade;
		} else {
			total = 1.50 * quantidade;
		}
		
		System.out.println("O total deu: " + total + " Reais");
		
		
		sc.close();
		
		*/
		
		Scanner sc = new Scanner(System.in);
			double num;
			System.out.println("Digite o n�mero para descobrir o intervalo: ");
			num = sc.nextDouble();
			if (num >= 0 && num <= 25) {
				System.out.println("Intervalo [0,25]");
			} else if (num > 25.00 && num <= 50) {
				System.out.println("Intervalo [25, 50]");
			} else if (num > 50 && num <= 75){
				System.out.println("Intervalo [50, 75]");
			} else if (num > 75 && num <= 100) {
				System.out.println("Intervalo [75, 100]");
			} else {
				System.out.println("Fora de intervalo");
			}
		sc.close();

	}

}
