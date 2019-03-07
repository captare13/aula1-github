package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreaTrigon {
	public static void main(String[] args) {
		//declaracao de variaveis
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A, B e C: ");
		double a = sc.nextDouble(); 
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		//calculo
		double areaTri = (a * c / 2);
		double areaCir = pi * c * c;
		double areaTra = ((a + b) * c)/2;
		double areaQua = b * b;
		double areaRet = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		System.out.printf("TRAPEZIO: %.3f%n", areaTra);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		System.out.printf("RETANGULO: %.3f%n", areaRet);
				
		sc.close();
	}
}
