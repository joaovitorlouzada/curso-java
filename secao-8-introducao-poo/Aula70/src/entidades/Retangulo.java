package entidades;

public class Retangulo {
	
	public double largura;
	public double altura;

	public double calcularArea() {
		return largura * altura;
	}
	public double calcularPerimetro() {
		return 2*(largura + altura);
	}
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2) );
	}
	public String toString() {
		return "Área = "
				+ calcularArea()
				+ "\nPerímetro = "
				+ calcularPerimetro()
				+ "\nDiagonal = "
				+ calcularDiagonal();
		
	}
	
}

