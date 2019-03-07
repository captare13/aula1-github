package entities;

public class DolarReal {
	
	public static final double IOF = 0.06;
	
	public static double conversor(double dolar, double qtde) {
		return dolar * qtde * (1+IOF);
	}
	
}
