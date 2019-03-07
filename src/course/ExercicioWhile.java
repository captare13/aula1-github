package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Inválida");
			System.out.print("digite novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}
}
