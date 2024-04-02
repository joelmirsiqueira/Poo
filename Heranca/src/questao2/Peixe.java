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

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Peixe [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" + numPatas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidade=" + velocidade + ", caracteristicas=" + caracteristicas
				+ "]";
	}


	

	
}
