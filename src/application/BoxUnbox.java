package application;

public class BoxUnbox {

	public static void main(String[] args) { //wrapper class, para utilizar ao inves de tipo primitivo
											//pois aceita valor nulo e primitivo n�o. ex: Integer.
		int x = 20;
		Integer obj = x;
		System.out.println(obj);
		int y = obj * 2;
		System.out.println(y);
	}

}
