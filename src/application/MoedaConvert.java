package application;

import java.util.Scanner;

import entities.DolarReal;

public class MoedaConvert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do dólar em real? ");
		double valor = sc.nextDouble();
		System.out.print("Quantos dólares irei comprar? ");
		double compra = sc.nextDouble();
		
		double total = DolarReal.conversor(valor, compra);
		
		System.out.printf("Valor a pagar em reais = %.2f%n.", total);		
		
		sc.close();
	}

}
