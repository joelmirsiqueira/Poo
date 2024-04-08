package questao2;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe(String nome, double comprimento, double velocidade) {
		super(nome, comprimento, "cinzenta", "mar", velocidade);
		this.setNumPatas(0);
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
