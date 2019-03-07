package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPrint2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int n1 = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int n2 = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(n1);
		System.out.printf("%.2f%n", price);
		System.out.println(name2);
		System.out.println(n2);
		System.out.printf("%.2f%n", height);
		
		sc.close();
		

	}

}
