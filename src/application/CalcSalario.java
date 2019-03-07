package application;

import java.util.Scanner;

import entities.Empregado;

public class CalcSalario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Empregado funcionario = new Empregado();
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		funcionario.bruto = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		funcionario.taxa = sc.nextDouble();

		System.out.println("Funcionário: " + funcionario);
		System.out.println("Digite quantos % de aumento: ");
		double aument = sc.nextDouble();
		funcionario.aumento(aument);
		System.out.printf("Atualização: " + funcionario);

		sc.close();
	}

}
