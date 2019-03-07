package course;

import java.util.Scanner;

public class ProgramDiaTardeNoite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas são? ");
		int n = sc.nextInt();
		
		if (n < 12) {
			System.out.println("Bom dia!");
		}
		else if (n < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}
}
