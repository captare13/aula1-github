package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioHorasTrabal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero do funcionário:");
		int num = sc.nextInt(); 
		System.out.println("digite o número de horas trabalhadas:");
		int horas = sc.nextInt();
		System.out.println("digite o valor da hora:");
		double valorHora = sc.nextDouble();
				
		double salario = horas * valorHora;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
				
		sc.close();
	}
}
