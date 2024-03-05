package questao1;

import java.util.Scanner;

public class Usuario {
	private static Scanner sc = new Scanner(System.in);
	private static Estudante aluno = new Estudante(null, null, null);
	
	public static void main(String[] args) {
		while (true) {
			if (menu() == false) {
				break;
			}
			System.out.println("tecle enter para continuar");
		}
	}
	
	public static boolean menu() {
		
		System.out.println();
		System.out.println("Digite a opção desejada: ");
		System.out.println();
		System.out.println("1. Criar um Estudante");
		System.out.println("2. Calcular Média");
		System.out.println("3. Obter número de matrícula");
		System.out.println("4. Obter Endereço");
		System.out.println("0. Sair");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			aluno = criarEstudante();
			return true;
			
		case 2:
			media(aluno);
			return true;
			
		case 3:
			matricula(aluno);
			return true;
			
		case 4:
			endereco(aluno);
			return true;
			
		case 0:
			return false;

		default:
			System.out.println("Opção inválida!");
			return true;
		}
	}
	
	public static Estudante criarEstudante() {
		System.out.println();
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("Matrícula: ");
		String matricula = sc.next();
		System.out.print("Endereço: ");
		String endereco = sc.next();
		
		Estudante novo = new Estudante(nome, matricula, endereco);
		
		return novo;
	}
	
	public static void media(Estudante aluno) {
		float media = aluno.media();
		
		if (media < 7) {
			System.out.println(media + " Aluno reprovado.");
		} else {
			System.out.println(media + " Aluno aprovado.");
		}
	}
	
	public static void matricula(Estudante aluno) {
		String matricula = aluno.getMatricula();
		
		System.out.println("Matícula: " + matricula);
	}
	
	public static void endereco(Estudante aluno) {
		String endereco = aluno.getEndereco();
		
		System.out.println("Endereço: " + endereco);
	}
}
