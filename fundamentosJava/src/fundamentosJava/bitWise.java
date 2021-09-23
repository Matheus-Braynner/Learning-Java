package fundamentosJava;

import java.util.Scanner;

public class bitWise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bith is true");
		} else {
			System.out.println("6th bith is false");
		}
		
		sc.close();

	}

}
