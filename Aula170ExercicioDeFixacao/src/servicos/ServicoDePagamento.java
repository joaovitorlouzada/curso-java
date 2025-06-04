package servicos;

public interface ServicoDePagamento {
	
	public Double taxaPagamento(double quantia) ;
		
	public Double juros(double quantia, int meses);
	
	
}
