package modelo.servicos;

import java.time.Duration;

import entidades.AluguelDeCarro;
import entidades.Fatura;

public class AluguelService {
	
	private Double precoPorHora;
	private Double precoPorDia;
	
	private TaxService impostoService;

	public AluguelService(Double precoPorHora, Double precoPorDia, BrasilImpostoService impostoService) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.impostoService = impostoService;
	}
	
	public void gerarFatura(AluguelDeCarro aluguelDeCarro) {
		
		double minutes = Duration.between(aluguelDeCarro.getInicio(), aluguelDeCarro.getFim()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = precoPorHora * Math.ceil(hours);
		}
		else {
			basicPayment = precoPorDia * Math.ceil(hours/24.0);
			
		}
		
		double tax = impostoService.tax(basicPayment);
		
		aluguelDeCarro.setFatura(new Fatura(basicPayment, tax));
		
		
	}
	

}
