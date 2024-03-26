package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<ContaBancaria> contas = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				incluirDados();
				break;

			case 2:
				sacar();
				break;
				
			case 3:
				depositar();
				break;
				
			case 4:
				render();
				break;

			case 5:
				mostrarTudo();
				break;
				
			case 0:
				System.out.println("Programa finalizado");
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while(opcao != 0);
	}
	public static int menu() {
		int opcao;
		String[] opcoes = {"Incluir dados", "Sacar", "Depositar", "Render", "Mostrar tudo"};
		System.out.println("Menu:");
		for(int i = 0; i < opcoes.length; i++){
			System.out.println((i+1) + ". " + opcoes[i]);
		}
		System.out.println("");
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
	public static void incluirDados() {
		if(contas.size() <= 5) {
			System.out.println("1. CC");
			System.out.println("2. CP");
			System.out.println("3. CE");
			System.out.print("Tipo de conta: ");
			int tipoConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			int numConta = contas.size() + 1;
			switch (tipoConta) {
			case 1:
				ContaBancaria conta = new ContaBancaria(nome, numConta);
				contas.add(conta);
				System.out.println("CC criada.");
				break;
			
			case 2:
				System.out.print("Taxa: ");
				double taxa = sc.nextDouble();
				sc.nextLine();
				Poupanca contaP = new Poupanca(nome, numConta, taxa);
				contas.add(contaP);
				System.out.println("CP criada.");
				break;

			case 3:
				System.out.print("Limite: ");
				double limite = sc.nextDouble();
				sc.nextLine();
				ContaEspecial contaE = new ContaEspecial(nome, numConta, limite);
				contas.add(contaE);
				System.out.println("CE criada.");
				break;

			default:
				System.out.println("opção inválida");
				break;
			}
			System.out.println();
		} else {
			System.out.println("Número máxido de contas atingido");
		}
	}
	public static void sacar() {
		System.out.print("numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor do saque: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		if(numConta <= contas.size()) {
			contas.get(numConta - 1).sacar(valor);
			
		}
	}
	public static void depositar() {
		System.out.print("numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Valor do deposito: ");
		double valor = sc.nextDouble();
		sc.nextLine();
		if(numConta <= contas.size()) {
			contas.get(numConta - 1).depositar(valor);
		}
		
	}
	public static void render() {
		for(ContaBancaria conta: contas) {
			if(conta.getClass().getSimpleName().equals("Poupanca")) {
				Poupanca contap = (Poupanca) conta;
				contap.calcularNovoSaldo();
				String tipo = conta.getClass().getSimpleName().equals("ContaBancaria") ? "CC" : conta.getClass().getSimpleName();
				System.out.println(tipo + " " + conta.numConta + " " + conta.nomeCliente + " " + conta.saldo);
			}
		}
	}

	public static void mostrarTudo() {
		for(ContaBancaria conta: contas) {
			String tipo = conta.getClass().getSimpleName().equals("ContaBancaria") ? "CC" : conta.getClass().getSimpleName();
			System.out.println(tipo + " " + conta.numConta + " " + conta.nomeCliente + " " + conta.saldo);
		}
	}
}
