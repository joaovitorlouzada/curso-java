package entidades;

public class Fatura {
	
	private Double pagamentoBasico;
	private Double imposto;
	
	public Fatura() {
		
	}

	public Fatura(Double pagamentoBsico, Double imposto) {
		this.pagamentoBasico = pagamentoBsico;
		this.imposto = imposto;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBsico) {
		this.pagamentoBasico = pagamentoBsico;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getPagamentoTotal() {
		return getPagamentoBasico() + getImposto() ;
	}
	

}
