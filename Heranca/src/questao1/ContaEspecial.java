package questao1;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public ContaEspecial(String nomeCliente, int numConta, double limite) {
		super(nomeCliente, numConta);
		this.limite = limite;
	}
	public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	public void sacar(double saque) {
		if((this.saldo + this.limite) >= saque) {
			this.saldo -= saque;
			System.out.println("Saque efetuado");
		} else {
			System.out.println("limite insuficiente");
		}
	}
}
