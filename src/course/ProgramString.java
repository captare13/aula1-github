package course;

public class ProgramString {

	public static void main(String[] args) {

		String original	= "abcde FGHIJ ABC abc DEFG";
		String s01 = original.toLowerCase(); // tudo minusculo
		String s02 = original.toUpperCase(); // tudo maiusculo
		String s03 = original.trim(); //elimina espaços no final
		String s04 = original.substring(2); //conta a partir da string 2
		String s05 = original.substring (2, 9); // inicio e fim da string conforme necessidade
		String s06 = original.replace('a', 'x'); // substitui a string específica
		String s07 = original.replace("abc", "xy"); //substitui uma seção específica
		int i = original.indexOf("bc"); //posição inicial da string bc
		int j = original.lastIndexOf("bc"); //ultima vez que a string aparece
		String s = "potato apple lemon"; //quebrar um string conforme separador " " (espaço)
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		
		System.out.println("original: -" +original+ "-");
		System.out.println("toLowerCase: -" +s01 + "-");
		System.out.println("toUpperCase: -" +s02 + "-");
		System.out.println("trim: -" +s03 + "-");
		System.out.println("Substring (2): -" +s04 + "-");
		System.out.println("Substring (2-9): -" +s05 + "-");
		System.out.println("Substring (a por x): -" +s06 + "-");
		System.out.println("Substring (abc por xy): -" +s07 + "-");
		System.out.println("Index of 'bc' :" +i);
		System.out.println("Last index of 'bc' :" +j);
		System.out.println("Vetor1: " +word1);
		System.out.println("Vetor1: " +word2);
		System.out.println("Vetor1: " +word3);
		System.out.println("Vetor2: " +vect[1]);
		System.out.println("Vetor3: " +vect[2]);
		
	}

}
