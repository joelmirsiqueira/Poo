package questao1;

public class ContaBancaria {
	protected String nomeCliente;
	protected int numConta;
	protected double saldo;
	public ContaBancaria(String nomeCliente, int numConta) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0;
	}
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public void depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Deposito efetuado");
	}
	public void sacar(double saque) {
		if(this.saldo >= saque) {
			this.saldo -= saque;
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
