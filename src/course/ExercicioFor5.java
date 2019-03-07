package course;

import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		int f = n;

		if (n == 0) {
			f = 1;
		}

		for (int i = n; i > 1; i--) {
			f = f * (i - 1);
		}
		System.out.println("Fatorial = " + f);
		sc.close();
	}
}
/* int n = sc.nextInt();

int fat = 1;
for (int i=1; i<=n; i++) {
	fat = fat * i;
}

System.out.println(fat);*/