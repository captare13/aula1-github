package application;

import java.util.Scanner;

import entities.ProdutoArray;

public class ArraysProduto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ProdutoArray[] vect = new ProdutoArray[n];
		for (int i = 0; i < vect.length; i++) { //vect.length é o tamanho do vetor.
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProdutoArray(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();

	}

}
