package entidades;

public class Estudante {
	public String nome;
	public int nota1;
	public int nota2;
	public int nota3;

	public int notaFinal() {
		return nota1 + nota2 + nota3;
	}
	public String toString() {
		if(notaFinal() > 60) {
			return "Nota Final = " +notaFinal()+ "\nPassou";
		}
		else {
			return "Nota Final = " +notaFinal()+"\nRepetiu\nFaltam " +calcularNotaRestante()+ " pontos";
		}
	}
	public int calcularNotaRestante() {
		return 60 - notaFinal();	
	}
}
