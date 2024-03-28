package questao3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	private static Scanner sc = new Scanner(System.in);
	private static Pessoa pessoaAtiva;
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			switch(opcao) {
			case 1:
				limpar();
				cadastrarPessoa();
				System.out.println();
				break;
			case 2:
				limpar();
				pessoasAbaixo();
				System.out.println();
				break;
			case 3:
				limpar();
				pessoasIdeal();
				System.out.println();
				break;
			case 4:
				limpar();
				pessoasAcima();
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
		System.out.println("1. Cadastrar uma pessoa");
		System.out.println("2. Mostrar as pessoas que estão abaixo do peso");
		System.out.println("3. Mostrar as pessoas que estão dentro do peso ideal");
		System.out.println("4. Mostrar as pessoas que estão acima do peso");
		System.out.println("0. Sair");
		System.out.println("");
		opcao = sc.nextInt();
		sc.nextLine();
		
		return opcao;
	}
	public static void cadastrarPessoa() {
		String nome;
		float peso, altura;
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Peso: ");
		peso = sc.nextFloat();
		sc.nextLine();
		System.out.print("altura: ");
		altura = sc.nextFloat();
		sc.nextLine();
		pessoaAtiva = new Pessoa(nome, peso, altura);
		pessoas.add(pessoaAtiva);
		System.out.println("Cadastro de " + pessoaAtiva.getNome() + " efetuado com sucesso!");
	}
	public static void pessoasAbaixo() {
		System.out.println("Pessoas abaixo do peso:");
		for(Pessoa pessoa : pessoas) {
			if(pessoa.imc() < 18.5f) {
				System.out.println(pessoa.getNome() + ", IMC = " + pessoa.imc() + ";");
			}
		}
	}
	public static void pessoasIdeal() {
		System.out.println("Pessoas abaixo do peso:");
		for(Pessoa pessoa : pessoas) {
			if(pessoa.imc() > 18.5f && pessoa.imc() < 25.0f) {
				System.out.println(pessoa.getNome() + ", IMC = " + pessoa.imc() + ";");
			}
		}
	}
	public static void pessoasAcima() {
		System.out.println("Pessoas abaixo do peso:");
		for(Pessoa pessoa : pessoas) {
			if(pessoa.imc() >= 25.0f) {
				System.out.println(pessoa.getNome() + ", IMC = " + pessoa.imc() + ";");
			}
		}
	}
	public static void limpar() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
}
