package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // não aceita tipos primitivos

		list.add("Maria");// 0
		list.add("Alex");// 1
		list.add("Bob");// 2
		list.add("Anna");// 3
		list.add(2, "Marco");// adicionou na posição 2

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		list.remove("Anna");// remove item da lista
		list.remove(1);// remove a posição
		list.removeIf(x -> x.charAt(0) == 'M');// remoção por predicado, todos com a letra M no primeiro caracter

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("----------");

		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());// filtra nomes
																											// começado
																											// com 'A'
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------");
		String name = list.parallelStream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		name = list.parallelStream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
