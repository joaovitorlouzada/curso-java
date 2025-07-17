package entidades;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;

	public double calcularSalarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentarSalario(double porcentagem) {
		salarioBruto = salarioBruto * (1 +(porcentagem/100));
	}
	public String toString() {
		return nome + ", " + " $ " +String.format("%.2f", calcularSalarioLiquido());
	}
}
