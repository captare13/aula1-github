package entities;

public class FuncionarioLista {

	private int id;
	private String nome;
	private double salario;

	public FuncionarioLista() {

	}

	public FuncionarioLista(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}

	public void aumSalario(double aumento) {
		salario = salario * (1 + (aumento / 100));
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
