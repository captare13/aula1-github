package application;

import java.util.Scanner;

import entities.Retangulo;

public class CalcRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret;
		ret = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		double area = ret.area();
		double perim = ret.perimetro();
		double diag = ret.diagonal();
		
		System.out.printf ("Area = %.2f%n", area);
		System.out.printf ("Perímetro = %.2f%n", perim);
		System.out.printf ("Diagonal = %.2f%n", diag);
		
		sc.close();
	}

}
