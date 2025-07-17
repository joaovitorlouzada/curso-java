package aplicacao;

import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidades.*;
import modelo.servicos.AluguelService;
import modelo.servicos.BrasilImpostoService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner leia = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		
		System.out.print("Modelo do carro: ");
		String modelo = leia.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(leia.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(leia.nextLine(), fmt);
		
		AluguelDeCarro aluguel = new AluguelDeCarro(inicio,fim, new Veiculo(modelo));
		
		
		System.out.print("Entre com o preço por hora: ");
		Double precoPorHora = leia.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double precoPorDia = leia.nextDouble();
		
		AluguelService aluguelService = new AluguelService(precoPorHora, precoPorDia, new BrasilImpostoService());
		
		aluguelService.gerarFatura(aluguel);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " +aluguel.getFatura().getPagamentoBasico());
		System.out.println("Imposto: " +aluguel.getFatura().getImposto());
		System.out.println("Pagamento Total: " +aluguel.getFatura().getPagamentoTotal());
		
		
		leia.close();

	}

}
