package entidades;

public class PessoaJuridica extends Contribuinte{
	
	private int numeroDeFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	@Override
	public Double calcularImposto() {
		
		if(numeroDeFuncionarios > 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
	}

}
