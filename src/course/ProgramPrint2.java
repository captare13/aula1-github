package course;

import java.util.Scanner;

public class ProgramPrint2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a seguir:");
		String sentence = sc.nextLine(); //digite Good Morning!
		String x, y, z;
		System.out.println("Digite um valor pra X:");
		x = sc.next(); // digite Red
		System.out.println("Digite um valor pra Y:");
		y = sc.next(); // digite Blue
		System.out.println("Digite um valor pra Z:");
		z = sc.next(); // digite Green
				
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = sc.next(); // digite Yellow
		y = sc.next(); // digite Orange
		z = sc.next(); // digite Gray
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();

	}

}
