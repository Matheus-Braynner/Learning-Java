package fundamentosJava;

import java.util.Locale;
import java.util.Scanner;

public class entrada_dados1 {

	public static void main(String[] args) {
/*Scanner sc = new Scanner(System.in);
		
		char x;
		
		x = sc.next() .charAt(0);
				
		System.out.printf("A primeira letra da palavra que você digitou é: " + x);
		
		sc.close();
		^n*/
		
		Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String x;
        double y;
        int z;

        x = sc.next();
        y = sc.nextDouble();
        z = sc.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
	}

}
