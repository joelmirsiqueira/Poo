package questao1;

public class Poupanca extends ContaBancaria {
	private double taxa;

	public Poupanca(String nomeCliente, int numConta, double taxa) {
		super(nomeCliente, numConta);
		this.taxa = taxa;
	}

	public Poupanca(String nomeCliente, int numConta, double saldo, double diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.taxa = diaRendimento;
	}
	public void calcularNovoSaldo() {
		this.saldo += this.saldo * this.taxa;
	}
}
