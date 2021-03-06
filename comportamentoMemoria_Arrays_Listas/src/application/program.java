package application;

import java.util.Scanner;

import entities.hostel;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		hostel[] vect = new hostel[10];
		System.out.println("How many rooms will be rent ? ");
		byte n = sc.nextByte();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #"+ i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			byte room = sc.nextByte();
			vect[room] = new hostel(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms :");
		for (int i =0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
