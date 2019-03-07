package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ControleEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(nome, preco);
		
		produto.setNome("Computer");
		System.out.println("Update nome: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Update preço: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Dados do produto: " +produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para dar entrada no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " +produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produtos para dar saída no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " +produto);
		
		sc.close();
	}
}
