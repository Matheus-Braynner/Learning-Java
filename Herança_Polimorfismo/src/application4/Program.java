package application4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.enums.Color;
import entities4.Circle;
import entities4.Rectangle;
import entities4.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #"+ i + " data:");
			System.out.print("Rectangle or Circle (r/c)?");
			char ans = sc.next().charAt(0);
			System.out.print("Color (BLACK, BLUE OR RED): ");
			Color color = Color.valueOf(sc.next());
			if (ans == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS");
		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();
	}

}
