package application;

import java.util.Locale;
import java.util.Scanner;

import entities.bank;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		bank bank;
		
		System.out.println("welcome to the E-BANK");
		System.out.println("Create your account for FREE");
		System.out.print("Enter the number account you want : ");
		int numberAccount = sc.nextInt();
		System.out.println("Enter your full name : ");
		sc.nextLine();
		String fullName = sc.nextLine();
		System.out.println("Is there a initial deposit (y/n) ? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new bank(numberAccount, fullName, initialDeposit);
		} else {
			bank = new bank(numberAccount, fullName);
		}
	
		System.out.println("");
		System.out.println("Account data : " + bank);
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bank.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		
		
			
		sc.close();
	}

}
