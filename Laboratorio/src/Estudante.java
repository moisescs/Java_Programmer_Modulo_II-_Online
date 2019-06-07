
public class Estudante {
	
	private String nome;
	private double notaMatematica;
	private double notaPortugues;
	private double meida;
	

	public Estudante(String nome, double notaMatematica, double notaPortugues) {
		this.nome = nome;
		this.notaMatematica = notaMatematica;
		this.notaPortugues = notaPortugues;
		//calculaMedia();
	}
	
	private void calculaMedia() {
		this.meida = ((this.notaMatematica + this.notaPortugues) / 2);

	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public double getMeida() {
		return meida;
	}
	public void setMeida(double meida) {
		this.meida = meida;
	}
	
}
