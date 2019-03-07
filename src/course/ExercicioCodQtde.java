package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCodQtde {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código e a quantidade:");
		int cod = sc.nextInt(); 
		int qtde = sc.nextInt();
		double valor = 0;
		if (cod == 1) {
			valor = 4.00;
		}
		else if (cod == 2) {
			valor = 4.50;
		}
		else if (cod == 3) {
			valor = 5.00;
		}
		else if (cod == 4) {
			valor = 2.00;
		}
		else if (cod == 5) {
			valor = 1.50;
		}
		else {
			System.out.println ("Código não cadastrado");
		}
			
		double valorPagar = (valor * qtde);
		System.out.printf("Total = R$ %.2f%n", valorPagar);
				
		sc.close();
	}
}
