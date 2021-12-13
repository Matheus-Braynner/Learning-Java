package application;

import java.io.File;
import java.util.Scanner;

public class filePath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getname: " + path.getName());
		System.out.println("getParent " + path.getParent());
		System.out.println("getParent " + path.getPath());
		sc.close();
	}

}
