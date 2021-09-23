package fundamentosJava;

import java.util.Scanner;

public class exercicio_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("Digite um numero 1<= x <= 1000");
		x = sc.nextInt();
		for (int i = 1; i <= 1000; i++) {
			if (x % 2 == 1) {
				x = x + 2;
				System.out.println(x);
			}
		}
		
		sc.close();
	}
	
}
