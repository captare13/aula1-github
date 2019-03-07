package course;

import java.util.Scanner;

public class ExercicioSoma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro valor:");
		int n1 = sc.nextInt();
		System.out.println("digite o segundo valor:");
		int n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("SOMA = " +soma);
				
		sc.close();
	}
}
