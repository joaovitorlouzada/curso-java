package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private int numero;
	private LocalDate data;
	private Double valorContrato;
	
	List <Parcela> parcelas = new ArrayList<>();

	public Contrato(int numero, LocalDate data, Double valorContrato) {
		this.numero = numero;
		this.data = data;
		this.valorContrato = valorContrato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	public void adicionarParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	
	public void removerParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}
	
	

	

}
