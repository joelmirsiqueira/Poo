package questao2;

public class Peixe extends Animal {
	private String caracteristicas;

	public Peixe(String nome, double comprimento, double velocidade) {
		super(nome, comprimento, "cinzenta", "mar", velocidade);
		this.setNumPatas(0);
		this.caracteristicas = "barbatanas e cauda";
	}

	public String getCaracterirticas() {
		return caracteristicas;
	}

	public void setCaracterirticas(String caracterirticas) {
		this.caracteristicas = caracterirticas;
	}

	
}
