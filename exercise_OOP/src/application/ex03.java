package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student stud = new student();
		
		System.out.print("Enter your name: ");
		stud.name = sc.next();
		System.out.println("Enter your three notes: (high marks = 100): ");
		stud.x = sc.nextDouble();
		stud.y = sc.nextDouble();
		stud.z = sc.nextDouble();
		
		if (stud.allNotes() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f", stud.passOrNot());
		} else {
			System.out.println("PASS");
		}
		
		
		sc.close();

	}

}
