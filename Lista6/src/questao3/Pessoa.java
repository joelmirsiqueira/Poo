package questao3;

public class Pessoa {

	private String nome;
	private float peso;
	private float altura;
	
	public Pessoa(String nome, float peso, float altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float imc() {
		float imc = this.peso / (this.altura + this.altura);
		return imc;
	}
}
