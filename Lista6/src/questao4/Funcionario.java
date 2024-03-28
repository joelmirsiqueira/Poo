package questao4;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double imposto() {
		double imposto;
		if(this.salario <= 2000){
			imposto = 0;
		} else if(this.salario > 2000 && this.salario <= 3500){
			imposto = this.salario * 0.15;
		} else if(this.salario > 3500 && this.salario <= 5000){
			imposto = this.salario * 0.22;
		} else {
			imposto = this.salario * 0.30;
		}
		return imposto;
	}
}
