package questao2;

public class Mamifero extends Animal {
	private String caracteristicas;

	public Mamifero(String nome, double comprimento, String cor, double velocidade) {
		super(nome, comprimento, cor, "terra", velocidade);
		this.caracteristicas = "alimento preferido";
	}


	public String getcaracteristicas() {
		return caracteristicas;
	}

	public void setcaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Mamifero [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" + numPatas + ", cor=" + cor
				+ ", ambiente=" + ambiente + ", velocidade=" + velocidade + ", caracteristicas=" + caracteristicas
				+ "]";
	}


 }
