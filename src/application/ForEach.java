package application;

public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String obj : vect) { //passa por todos os objetos contido no vetor.
			System.out.println(obj);
		}

	}

}
