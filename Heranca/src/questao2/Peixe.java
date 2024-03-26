package questao2;

public class Peixe extends Animal {
	private boolean barbatanas;
	private boolean cauda;
	
	public Peixe(String nome, float comprimento, float velocidade, boolean barbatanas, boolean cauda) {
		super(nome, comprimento, 0, "cinzenta", "mar", velocidade);
		this.barbatanas = barbatanas;
		this.cauda = cauda;
	}
	
}
