package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class BancoDuarte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ContaBancaria cliente = new ContaBancaria(); //professor declarou diferente "ContaBancaria cliente;"
		System.out.print("Entre com o n�mero da conta:");
		int num = sc.nextInt();
		System.out.printf("Entre com o nome do cliente:");
		sc.nextLine(); 
		String nome = sc.nextLine();
		System.out.print("Haver� um dep�sito inicial? (y/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'n' || resposta == 'N') {
			cliente = new ContaBancaria(num, nome);
		} else {
			System.out.print("Entre com o valor do dep�sito inicial:");
			double inicial = sc.nextDouble();
			cliente = new ContaBancaria (num, nome, inicial);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("Entre com o valor para dep�sito: ");
		cliente.deposito(sc.nextDouble()); //professor declarou um double antes e esse double foi utilizado no par�nteses
		System.out.println("Dados atualizados da conta:");
		System.out.println(cliente);
		
		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		cliente.saque(sc.nextDouble()); //professor declarou um double antes e esse double foi utilizado no par�nteses
		System.out.println("Dados atualizados da conta:");
		System.out.println(cliente);
		
		sc.close();
	}

}
