package questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionarioAtivo;
	private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
		do {
			opcao = menu();
			switch(opcao) {
			case 1:
				limpar();
				cadastrarFuncionario();
				System.out.println();
				break;
			case 2:
				limpar();
				calcularImposto();
				System.out.println();
				break;
			case 0:
				limpar();
				System.out.println("Programa finalizado!");
				break;
			default:
				limpar();
				System.out.println("Opção invalida");
				System.out.println("");
				break;
			}
		} while(opcao != 0);
    }
    public static int menu() {
		int opcao;
		System.out.println("Opções:");
		System.out.println("1. Cadastrar funcionario");
		System.out.println("2. calcular imposto");
		System.out.println("0. Sair");
		System.out.println("");
		opcao = sc.nextInt();
		sc.nextLine();
		
		return opcao;
	}
    public static void cadastrarFuncionario() {
		String nome;
		double salario;
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		sc.nextLine();
		funcionarioAtivo = new Funcionario(nome, salario);
		funcionarios.add(funcionarioAtivo);
		System.out.println("Cadastro de " + funcionarioAtivo.getNome() + " efetuado com sucesso!");
	}
    public static void calcularImposto() {
        String nome;
        System.out.print("Nome do funcionário: ");
        nome = sc.nextLine();
        buscarFuncionario(nome);
        System.out.println(funcionarioAtivo.getNome() + " vai pagar R$ " + String.format("%.2f", funcionarioAtivo.imposto()) + " de impostos.");
    }
    public static void buscarFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getNome().equalsIgnoreCase(nome)) {
                funcionarioAtivo = funcionario;
            }
        }
    }
    public static void limpar() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
