package aplicacao;

import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.*;
import servicos.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner leia = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int numero = leia.nextInt();
		System.out.print("Data(dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(leia.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valorContrato = leia.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Entre com o número de parcelas: ");
		int numParcelas = leia.nextInt();
		
		ServicoDeContrato servicoDeContrato = new ServicoDeContrato(new ServicoPaypal());
		
		servicoDeContrato.processarContrato(contrato, numParcelas);
		System.out.println("Parcelas: ");
		for(Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		leia.close();

	}

}
