package application;

import java.util.Scanner;

import entities.Quartos;

public class AluguelQuartos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Quartos[] vetor = new Quartos[10];

		System.out.print("Quantos quartos serão alugados? ");
		int qtde = sc.nextInt();
		int quarto = 0;

		for (int i = 0; i < qtde; i++) {
			System.out.printf("aluguel #%d:%n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String mail = sc.nextLine();
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			vetor[quarto] = new Quartos(nome, mail);
		}
		System.out.println("Quartos alugados:");
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] != null) {
				System.out.printf("%d: ", j);
				System.out.println(vetor[j]);
			}
			sc.close();
		}
	}

}
/* Correção:
Scanner sc = new Scanner(System.in);
Rent[] vect = new Rent[10];
System.out.print("How many rooms will be rented? ");
int n = sc.nextInt();
for (int i=1; i<=n; i++) {
System.out.println();
System.out.println("Rent #" + i + ":");
System.out.print("Name: ");
sc.nextLine();
String name = sc.nextLine();
System.out.print("Email: ");
String email = sc.nextLine();
System.out.print("Room: ");
int room = sc.nextInt();
vect[room] = new Rent(name, email);
}
System.out.println();
System.out.println("Busy rooms:");
for (int i=0; i<10; i++) {
if (vect[i] != null) {
System.out.println(i + ": " + vect[i]);
}
}
sc.close();*/
