package application;

import java.util.Scanner;

import entities.Estudante;

public class CalcAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Estudante aluno = new Estudante();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a 1ª nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a 3ª nota: ");
		aluno.nota3 = sc.nextDouble();

		System.out.println(aluno);
		if (aluno.faltam() > 60) {
			System.out.println("Passou");
		} else {
			System.out.println("Falhou");
			System.out.printf("Falta(m) %.2f ponto(s).", aluno.faltam());
		}
		sc.close();
	}

}
