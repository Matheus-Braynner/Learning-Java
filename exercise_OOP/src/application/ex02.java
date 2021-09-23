package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee emp = new employee();
		
		System.out.print("Name: ");
		emp.name = sc.next();
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f %n", emp.name, emp.netSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.printf("Updated data : "+ emp.toString());

		
		sc.close();

	}

}
