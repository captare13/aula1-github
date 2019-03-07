package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalcRaio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o o valor do raio:");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.printf("A= %.4f%n", area);
				
		sc.close();
	}
}
