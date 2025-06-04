package servicos;

import java.time.LocalDate;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcela;

public class ServicoDeContrato {
	
	private ServicoDePagamento servicoDePagamento;
	
	public ServicoDeContrato(ServicoDePagamento servicoDePagamento) {
		this.servicoDePagamento = servicoDePagamento;
	}
	

	public void processarContrato(Contrato contrato, int meses) {
		
		double parcelaBasica = contrato.getValorContrato() / meses;
		
		for(int i = 1 ; i <= meses; i++) {
			LocalDate dataDeVencimento = contrato.getData().plusMonths(i);
			
			double juro = servicoDePagamento.juros(parcelaBasica, i);
			
			double taxa = servicoDePagamento.taxaPagamento(parcelaBasica + juro);
			
			double parcelaTotal = parcelaBasica + juro + taxa;
			
			contrato.adicionarParcela(new Parcela(dataDeVencimento, parcelaTotal));
		}
		
	}

}
 