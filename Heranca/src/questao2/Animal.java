package questao2;

public class Animal {
	protected String nome;
	protected float comprimento;
	protected int numPatas;
	protected String cor;
	protected String ambiente;
	protected float velocidade;
	
	public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public Animal(String nome, float comprimento, String cor, String ambiente, float velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = 4;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
}
