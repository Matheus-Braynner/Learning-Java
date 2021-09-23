package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class ex01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rectan = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectan.x = sc.nextDouble();
		rectan.y = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectan.area());
		System.out.printf("PERIMETER = %.2f%n", rectan.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectan.diagonal());
		
	sc.close();
	}

}
