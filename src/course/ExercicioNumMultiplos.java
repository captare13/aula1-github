package course;

import java.util.Scanner;

public class ExercicioNumMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Digite dois n�meros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o Multiplos");
			}
		sc.close();
		
	}	

}
