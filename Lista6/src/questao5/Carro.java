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
	public float getCombustivel() {
		return this.combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	public float getEficiencia() {
		return eficiencia;
	}
	public void setEficiencia(float eficiencia) {
		this.eficiencia = eficiencia;
	}
	public void reabastecer(float combustivel) {
		this.combustivel += combustivel;
		System.out.println("Reabastecido com sucesso!");
	}
	public void andar(float quilometragem) {
		if((this.eficiencia * this.combustivel) >= quilometragem) {
			this.combustivel -= quilometragem / this.eficiencia;
			System.out.println(quilometragem + " km percorrido com sucesso!");
		} else {
			System.out.println("É necessário reabastecer o carro");
		}
	}
}
