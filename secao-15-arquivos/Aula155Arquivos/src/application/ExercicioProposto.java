package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ExercicioPropostoProduto;

public class ExercicioProposto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<ExercicioPropostoProduto> listaProdutos = new ArrayList<>();

		System.out.print("Digite o caminho do arquivo .csv: ");
		String path = leia.nextLine();

		//Manipulando o arquivo para fazer a gravação depois 
		File sourceFile = new File(path);
		String sourceFolder = sourceFile.getParent();

		//Criando o subdiretorio através do parent e atribuindo a operação a um boolean para visualizar o resultado
		boolean success = new File(sourceFolder + "\\out").mkdir();
		System.out.println("Folder created: " +success);

		//Criar agora o arquivo de saída
		String targetFile = sourceFolder + "\\out\\summary.csv";

		try(BufferedReader br= new BufferedReader(new FileReader(path))) {
			String line;
			while((line = br.readLine()) != null) {

				String [] atributosDoProduto = line.split(",");


				String nome = atributosDoProduto[0].trim();
				double preco = Double.parseDouble(atributosDoProduto[1].trim());
				int quantidade = Integer.parseInt(atributosDoProduto[2].trim());

				ExercicioPropostoProduto produto = new ExercicioPropostoProduto(nome, preco, quantidade);
				listaProdutos.add(produto);
			}

			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){

				for(ExercicioPropostoProduto product : listaProdutos) {

					//System.out.println(product.getNome() + "," + product.total());
					bw.write(product.getNome() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
				System.out.println(targetFile + " CREATED");


			}catch(IOException e) {
				System.out.println("Error writing file: " +e.getMessage());
			}
			leia.close();



		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
