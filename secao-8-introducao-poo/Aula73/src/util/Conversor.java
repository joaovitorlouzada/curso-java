package util;

public class Conversor {
	
	
	public static double calcularValorASerPago(double cotacaoDolar, double dolaresASeremComprados) {
		return (dolaresASeremComprados * cotacaoDolar) * (1 + (6.0/100));
	}

}
