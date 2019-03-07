package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (2*largura)+(2*altura);
	}
	
	public double diagonal() {
		double a = (this.largura * this.largura) + (this.altura * this.altura);
		double sq = Math.sqrt(a);
		return sq;
				
	}
}
