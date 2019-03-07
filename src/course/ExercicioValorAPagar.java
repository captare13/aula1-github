package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorAPagar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt(); 
		int num = sc.nextInt();
		double valor = sc.nextDouble();
		
		int cod2 = sc.nextInt(); 
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
				
		double valorPagar = (valor * num  + valor2 * num2);
		System.out.println("Sua escolha: " + cod + ", " + cod2);
		System.out.printf("VALOR A SER PAGO = R$ %.2f%n", valorPagar);
				
		sc.close();
	}
}
