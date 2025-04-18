package entidades;

public class PessoaFisica extends Contribuinte {
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	@Override
	public Double calcularImposto() {
		Double imposto = 0.0;
		if(rendaAnual < 20000) {
			imposto = rendaAnual * 0.15;
		}
		else if(rendaAnual > 20000) {
			imposto = rendaAnual * 0.25;	
		}
		if(gastosComSaude > 0) {
			imposto -= gastosComSaude * 0.50;
		}
		return imposto;
	}

	
	

}
