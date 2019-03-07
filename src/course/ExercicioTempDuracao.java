package course;

import java.util.Scanner;

public class ExercicioTempDuracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1;
		int h2;
		int calc;
		System.out.println("Digite horário de inicio e fim: ");
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		if (h1==0 && h2==0) {
			System.out.printf("O JOGO DUROU 24 HORA(S)");
		}
		else if (h1<h2){
			calc = h2-h1;
			System.out.printf("O JOGO DUROU %d HORA(S)", calc);
			}
		else {
			calc = 24-h1+h2;
			System.out.printf("O JOGO DUROU %d HORA(S)", calc);
		}
		sc.close();
		
	}	

}
