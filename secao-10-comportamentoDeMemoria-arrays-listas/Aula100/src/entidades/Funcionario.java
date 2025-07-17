package entidades;

public class Funcionario {
	private String id;
	private String nome;
	private double salario;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	public Funcionario() {
		
	}
	public Funcionario(String id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
}
