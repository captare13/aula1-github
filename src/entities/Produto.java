package entities;

public class Produto {

	String nome;
	private double preco;
	private int quantidade; //this.quantidade se refere a essa variável
	
	public Produto() { //constructor padrão
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	public void addProduto (int quantidade) {
		this.quantidade += quantidade; 
	}
	public void removeProdutos (int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidade(s), Total= R$ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}

