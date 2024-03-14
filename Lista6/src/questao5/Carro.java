package questao5;

public class Carro {
	private float combustivel;
	private float eficiencia;
	public Carro(float combustivel, float eficiencia) {
		super();
		this.combustivel = combustivel;
		this.eficiencia = eficiencia;
	}
	public Carro(float eficiencia) {
		super();
		this.combustivel = 0;
		this.eficiencia = eficiencia;
	}
	
}
