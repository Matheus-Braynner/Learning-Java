package fundamentosJava;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String nome;
	    double altura, peso, imc;
	    System.out.println("Digite o seu nome: ");
	    nome = sc.next();
	    System.out.println("Digite o seu peso em KG: ");
	    peso = sc.nextDouble();
	    System.out.println("Digite a sua altura: ");
	    altura = sc.nextDouble();
	    imc = peso / Math.pow(altura, altura);

	    if (imc < 18.5) {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está abaixo do peso", nome, imc);
	    } else if (imc >= 18.5 && imc < 24.9) {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está com o peso normal", nome, imc);
	    } else if (imc >= 25 && imc < 29.9) {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está com sobrepeso", nome, imc);
	    } else if (imc >= 30 && imc < 34.9) {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está com obesidade grau I", nome, imc);
	    } else if (imc >= 35 && imc < 39.9) {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está com obesidade grau II", nome, imc);
	    } else {
	        System.out.printf("Olá, %s seu imc é: %.2f%nVocê está com obesidade grau III ou mórbida", nome, imc);
	    }
	    
	    sc.close();

	}

}
