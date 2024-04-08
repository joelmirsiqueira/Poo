package base;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcao = 1;
		while(opcao != 0) {
			System.out.println("1. Cadastrar conta");
			System.out.println("2. Depositar");
			System.out.println("3. Render juros");
			System.out.println("4. Consultar agencia");
			System.out.println("5. Alterar agencia");
			System.out.println("0. Sair");
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
			case 1:
				System.out.print("Número da conta: ");
				int numC = sc.nextInt();
				sc.nextLine();
				System.out.print("Número da agencia: ");
				int numA = sc.nextInt();
				sc.nextLine();
				System.out.print("Nome da agencia: ");
				String nomeA = sc.nextLine();
				System.out.print("CPF do cliente: ");
				String cpf = sc.nextLine();
				System.out.print("Nome do cliente: ");
				String nomeC = sc.nextLine();
				Agencia ag = new Agencia(numA, nomeA);
				Cliente c = new Cliente(nomeC, cpf);
				System.out.println("Conta poupança? 1.Sim | 2.Não");
				int tipo = sc.nextInt();
				sc.nextLine();
				
				if(tipo == 1) {
					Poupanca poupanca = new Poupanca(numC, ag, c);
					contas.add(poupanca);
				} else {
					Conta conta = new Conta(numC, ag, c);
					contas.add(conta);
				}
				break;
			case 2:
				System.out.print("CPF do cliente: ");
				cpf = sc.nextLine();
				for(Conta conta: contas) {
					if(conta.getCliente().getCpf().equals(cpf)) {
						System.out.print("Valor: ");
						double valor = sc.nextDouble();
						sc.nextLine();
						conta.depositar(valor);
					}
				}
				break;
			case 3:
				System.out.print("CPF do cliente: ");
				cpf = sc.nextLine();
				for(Conta conta: contas) {
					if(conta.getCliente().getCpf().equals(cpf)) {
						if(conta instanceof Poupanca) {
							((Poupanca) conta).renderJuros();
						}
					}
				}
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			}
		}
		sc.close();
	}
}
