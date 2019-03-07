package entities;

public class Empregado {
	public String nome;
	public double bruto;
	public double taxa;
	
	public double liquido() {
		return bruto - taxa;
	}
	
	public void aumento(double porcento) {
		this.bruto = this.bruto * (1 + (porcento/100));
	}
	
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", liquido());
	}
}
