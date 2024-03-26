package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	private static Scanner sc = new Scanner(System.in);
	private static Animal animalAtivo;
	private static ArrayList<Animal> animais = new ArrayList<>();
	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
		} while(opcao != 0);
		switch(opcao) {
		case 1:
			incluirPeixe();
			break;
			
		case 2:
			incluirMamifero();
			break;
			
		case 3:
			listarAnimais();
			break;
			
		case 4:
			listarPeixes();
			break;
			
		case 0:
			sair();
			break;
			
		default:
			System.out.println("Opção inválida.");
			break;
		}
	}
	public static int menu() {
		int opcao;
		System.out.println("Menu:");
		System.out.println("1. Incluir peixe");
		System.out.println("2. Incluir mamífero");
		System.out.println("3. Listar todos os animais cadastrados");
		System.out.println("4. Listar todos os peixes cadastrados");
		System.out.println("0. Sair");
		System.out.println();
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
	public static void incluirPeixe() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Comprimento: ");
		float comprimento = sc.nextFloat();
		System.out.print("Velocidade: ");
		float velocidade = sc.nextFloat();
		System.out.print("Barbatanas: ");
		boolean barbatanas = sc.nextBoolean();
		System.out.print("Cauda: ");
		boolean cauda = sc.nextBoolean();
		animalAtivo = new Peixe(nome, comprimento, velocidade, barbatanas, cauda);
		animais.add(animalAtivo);
	}
	public static void incluirMamifero() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Comprimento: ");
		float comprimento = sc.nextFloat();
		System.out.print("Número de patas: ");
		int numPatas = sc.nextInt();
		
		
		//animalAtivo = new Mamifero(nome, comprimento, numPatas, cor, velocidade, alimentoPreferido);
		animais.add(animalAtivo);
	}
}
