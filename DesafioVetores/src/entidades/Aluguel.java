package entidades;

public class Aluguel {
	
	private String nome;
	private String email;
	private int numQuarto;
	private boolean vago;
	
	public boolean isVago() {
		return vago;
	}
	public void setVago(boolean vago) {
		this.vago = vago;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	@Override
	public String toString() {
		//return "Aluguel [nome=" + nome + ", email=" + email + ", numQuarto=" + numQuarto + "]";
		return numQuarto+ ": " 
				+nome+ ", "
				+email;
	}
	
}

