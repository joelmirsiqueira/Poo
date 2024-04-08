package base;

public class Poupanca extends Conta {
	private double juros;
	
	public Poupanca(int numero, Agencia agencia, Cliente cliente) {
		super(numero, agencia, cliente);
		this.juros = 0.0015;
	}
	
	public void renderJuros() {
		double juros = this.saldo * this.juros;
		System.out.println("Juros: " + juros);
		this.saldo += this.juros;
		System.out.println("Novo saldo: " + this.saldo);
	}
}
