package questao2;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe(String nome, double comprimento, double velocidade) {
		super(nome, comprimento, 0, "cinzenta", "mar", velocidade);
		this.caracteristicas = "barbatanas e cauda";
	}

	public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade) {
		super(nome, comprimento, 0, cor, ambiente, velocidade);
		this.caracteristicas = "barbatanas e cauda";
	}

	public String getCaracterirticas() {
		return caracteristicas;
	}

	public void setCaracterirticas(String caracterirticas) {
		this.caracteristicas = caracterirticas;
	}

	
}
