package servicos;

public class ServicoPaypal implements ServicoDePagamento {

	@Override
	public Double taxaPagamento(double quantia) {
		return quantia * 0.02;
	}

	@Override
	public Double juros(double quantia, int meses) {
		// TODO Auto-generated method stub
		
		return quantia * 0.01 * meses;
	}

}
