package questao2;

public class Mamifero extends Animal {
	private String alimentoPreferido;
	
	public Mamifero(String nome, float comprimento, int numPatas, String cor, float velocidade, String alimentoPreferido) {
		super(nome, comprimento, cor, "terra", velocidade);
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.velocidade = velocidade;
		this.alimentoPreferido = alimentoPreferido;
	}
}
