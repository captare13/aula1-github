package course;

import java.util.Scanner;

public class ProgramExpCondTerna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor:");
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; // express�o condicional tern�ria
		System.out.printf("Desconto %.2f%n", desconto);
		sc.close();
	}

}
