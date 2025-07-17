package entidades;

public class Triangulo {

	public double a;
	public double b;
	public double c;

	public double calcularAreaTriangulo(){
		double p = (a + b+ c) / 2.0;
		double areaTriangulo = Math.sqrt(p * (p - a) * (p-b) * (p-c));
		return areaTriangulo;
	}
}

