package application;

import java.util.Locale;
import java.util.Scanner;

import entities.libraly;

public class exercicioTreino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		libraly libraly;
		
		System.out.print("Enter your name:  ");
		String name = sc.nextLine();
		System.out.print("Enter your cpf : ");
		long cpf = sc.nextLong();
		System.out.println("Do you want deposit money in the libraly (y/n) ?");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
		System.out.println("How much money do you want to put in : ");
		double initialDeposit = sc.nextDouble();
		libraly = new libraly(name, cpf, initialDeposit);
		} else {
			libraly = new libraly(name, cpf);
		}
		
		System.out.println("");
		System.out.println("Updated data : " + libraly);
		
		System.out.println("");
		System.out.println("Enter a deposit value : ");
		double depositValue = sc.nextDouble();
		libraly.deposit(depositValue);
		System.out.println("Updated account data : " + libraly);
		
		System.out.println("");
		System.out.println("Enter a widthdraw value : ");
		double withdrawtValue = sc.nextDouble();
		libraly.withdwaw(withdrawtValue);
		System.out.println("Updated account data : " + libraly);

		sc.close();

	}

}
