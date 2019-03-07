package course;

import java.util.Scanner;

public class ExercicioDiferDeMultip {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor para A:");
		int a = sc.nextInt();
		System.out.println("digite o valor para B:");
		int b = sc.nextInt();
		System.out.println("digite o valor para C:");
		int c = sc.nextInt();
		System.out.println("digite o valor para D:");
		int d = sc.nextInt();
		
		int dif = (a * b - c * d);
		
		System.out.println("DIFERENCA = " +dif);
				
		sc.close();
	}
}
