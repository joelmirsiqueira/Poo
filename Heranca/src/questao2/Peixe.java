package questao2;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velocidade) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidade);
		this.caracteristicas = "Barbatanas e cauda";
	}

	public Peixe(String nome, float comprimento, float velocidade) {
		super(nome, comprimento, 0, "cinzenta", "mar", velocidade);
		this.caracteristicas = "Barbatanas e cauda";
	}
	
}
