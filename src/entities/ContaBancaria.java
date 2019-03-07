package entities;

public class ContaBancaria {

	public static final double TAXA = 5.00;
	private int numConta;
	private String nome;
	private double valor;

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void deposito(double valor) {
		this.valor += valor;
	}

	public void saque(double valor) {
		this.valor -= valor + TAXA;
	}

	public int numConta(int conta) {
		return this.numConta = conta;
	}

	public ContaBancaria() { //professor não precisou criar esse constructor
	}

	public ContaBancaria(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito (depositoInicial);
	}

	public ContaBancaria(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public String toString() {
		return "Conta " 
				+ numConta //outra forma: String.format("%d", getNumConta()) 
				+ ", " 
				+ "Cliente: " 
				+ nome //outra forma: getNome() 
				+ ", Balanço: R$ "
				+ String.format("%.2f", getValor());

	}
}