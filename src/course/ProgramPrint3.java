package course;

import java.util.Locale;

public class ProgramPrint3 {

	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
		System.out.print("Teste");
		System.out.println("Prova");
		System.out.println("Fudeu");
		System.out.println("------");
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		System.out.println("-----------------");
		System.out.printf("%s is %d years old, gender %c and got balance = %.2f bitcoins%n", name, age, gender, balance);
	}

}
