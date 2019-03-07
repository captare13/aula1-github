package course;

import java.util.Scanner;

public class ExercicioWhileIII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione o combustível:");
		System.out.println("1.Álcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Fim");
		int n = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (n != 4) {

			if (n == 1) {
				alcool++;
				System.out.println("Selecione o combustível:");
				n = sc.nextInt();
			} else if (n == 2) {
				gasolina++;
				System.out.println("Selecione o combustível:");
				n = sc.nextInt();
			} else if (n == 3) {
				diesel++;
				System.out.println("Selecione o combustível:");
				n = sc.nextInt();
			} else if (n < 0 || n > 4) {
				System.out.print("Código inválido, digite novamente: ");
				n = sc.nextInt();
			}
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
