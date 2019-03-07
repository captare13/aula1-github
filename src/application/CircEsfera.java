package application;

import java.util.Scanner;

import entities.Calculator;
//entender classe est�tica
public class CircEsfera {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}