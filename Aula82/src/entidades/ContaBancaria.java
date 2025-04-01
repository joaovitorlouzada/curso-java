package entidades;

public class ContaBancaria {
	
	private String numeroDaConta;
	private String nomeDoTitular;
	private double saldo;
	
	//Construtores da Classe
	
	public ContaBancaria(String numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	public ContaBancaria(String numeroDaConta, String nomeDoTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		realizarDeposito(depositoInicial);
	}
	//---------------------
	
	//Getter e Setters da Classe
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	@Override
	public String toString() {
		return "ContaBancaria [numeroDaConta=" + numeroDaConta + ", nomeDoTitular=" + nomeDoTitular + ", saldo=" + saldo
				+ "]";
	}
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	//--------------------------
	
	//Métodos Comuns da Classe
	
	public void realizarDeposito(double valor) {
		saldo += valor;
	}
	public void realizarSaque(double valor) {
		saldo = saldo - valor - 5;
	}
	
	//--------------------------

}
