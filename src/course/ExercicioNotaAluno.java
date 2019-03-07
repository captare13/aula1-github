package course;

import java.util.Scanner;

public class ExercicioNotaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite o nome do aluno:");
			String nome = sc.next();
			System.out.println("Digite as três notas do aluno");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			double nota = n1 + n2 + n3;
			System.out.println("Aluno: " + nome);
			System.out.println("Nota final: " + nota);

			if (nota < 60) {
				System.out.println("REPROVADO");
			}
			System.out.println("");
			System.out.println("Repetir: (s/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}

}
