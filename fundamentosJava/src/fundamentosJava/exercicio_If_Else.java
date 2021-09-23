package fundamentosJava;

import java.util.Scanner;

public class exercicio_If_Else {

	public static void main(String[] args) {
		/*
		 *  				EXERCÍCIO 1
		 * 
		 * Scanner sc = new Scanner(System.in);
		 
			int num;
			System.out.println("Escreva um número, para descobrir se é positivo ou não positivo");
			num = sc.nextInt();
			if (num > 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Não positivo");
			}
		sc.close();
		*/
		
		/*
		 * 
		 * 				EXERCÍCIO 2
		 
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite o número, para saber se é par ou ímpar");
		num = sc.nextInt();
		if (num % 2 == 1) {
			System.out.println("Número ímpar");
		} else {
			System.out.println("Número par1");
		}
		
		sc.close();
		
		*/
		/*
		 * 
		 * 				EXERCÍCIO 3
		 
		Scanner sc = new Scanner(System.in);
		int A, B;
		System.out.println("Digite dois números, para descobrir se eles são multiplos");
			A = sc.nextInt();
			B = sc.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não Multiplos");
		}
		
		sc.close();
		
		*/
		
		/*
		 * 
		 * 				EXERCÍCIO 4
		 * 
		Scanner sc = new Scanner(System.in);
		int horarioInicial, horarioFinal, duracao;
		System.out.println("Digite o horário que começou a jogar: ");
		horarioInicial = sc.nextInt();
		System.out.println("Digite o horário que terminou de jogar: ");
		horarioFinal = sc.nextInt();
		
		if (horarioInicial < horarioFinal) {
			duracao = horarioFinal - horarioInicial;
		} else {
			duracao = 24 - horarioInicial - horarioFinal;
		}
		System.out.println("O jogo teve uma duração de " + duracao + " Horas");
		sc.close();
		*/
		/*
		 * 
		 * 			EXERCÍCIO 5
		 * 
		Scanner sc = new Scanner(System.in);
		double item, quantidade, total;
		System.out.println("Coloque o item que você quer ( de 1 a 5): ");
		item = sc.nextInt();
		System.out.println("Digite a quantidade do item que você quer: ");
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
			System.out.println("Digite o número para descobrir o intervalo: ");
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
