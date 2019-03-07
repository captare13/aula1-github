package application;

import java.util.Scanner;

public class MatrixFindItem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Para matriz m x n, faça:");
		System.out.print("Digite o valor de m: ");
		int m = sc.nextInt();
		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();
		int [][] mat = new int[m][n];
		
		System.out.print("Entre com os valores da matriz:");
		for (int i=0; i < m;i++) {   //(int i = 0; i < mat.length; i++)
			for (int j=0; j < n; j++) {   //(int j = 0; j < mat[i].length; i++)
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Digite um número da matriz: ");
		int num = sc.nextInt();
		for (int i=0; i < m;i++) {   //(int i = 0; i < mat.length; i++)
			for (int j=0; j < n; j++) {   //(int j = 0; j < mat[i].length; i++)
				if (mat[i][j] == num) {
					System.out.println("Position " + i + "," + j + ":");
					if (j-1 >=0 && j-1 < n ) {
					System.out.println("Esquerda: " + mat[i][j-1]);		
					}
					if (j+1 >=0 && j+1 < n ) {
					System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i-1 >=0 && i-1 < m ) {
					System.out.println("Cima: " + mat[i-1][j]);
					}
					if (i+1 >=0 && i+1 < m ) {
					System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
/*Correção:
 * System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}*/
