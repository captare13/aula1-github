package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for (int i=0; i < n;i++) {   //(int i = 0; i < mat.length; i++)
			for (int j=0; j < n; j++) {   //(int j = 0; j < mat[i].length; i++)
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal: ");
		for (int i=0; i<n;i++) {
			System.out.print(mat [i][i] + " ");
		}
		System.out.println();
		
		int contar = 0;
		for (int i=0; i < n;i++) {
			for (int j=0; j < n; j++) {
				if (mat[i][j] < 0) {
					contar++;
				}
			}
		}
		System.out.println("Números negativos= "+ contar);
		
		sc.close();
	}

}
