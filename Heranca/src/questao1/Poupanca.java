package questao1;

public class Poupanca extends ContaBancaria {
	private int diaRendimento;

	public Poupanca(String nomeCliente, int numConta, int diaRendimento) {
		super(nomeCliente, numConta);
		this.diaRendimento = diaRendimento;
	}

	public Poupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	public void calcularNovoSaldo(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}
