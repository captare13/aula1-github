package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.FuncionarioLista;

public class Listas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<FuncionarioLista> list = new ArrayList<>();
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int qtde = sc.nextInt();
		for (int i = 1; i <= qtde; i++) {
			System.out.println("Funcion�rio #" + i + ":");
			System.out.print("ID:");
			int id = sc.nextInt();
			System.out.printf("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio:");
			double salario = sc.nextDouble();
			list.add(new FuncionarioLista(id, nome, salario));
		}
		System.out.print("Entre com o id do funcion�rio para receber aumento: ");
		int num = sc.nextInt();
		
		FuncionarioLista result = list.stream().filter(x -> x.getId() == num).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("Esse ID n�o existe!");
		} else {
			System.out.print("Digite a porcentagem: ");
			double porcento = sc.nextDouble();
			result.aumSalario(porcento);
		}
		
		System.out.println();
		System.out.println("Lista de empregados:");
		
		for (FuncionarioLista obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
