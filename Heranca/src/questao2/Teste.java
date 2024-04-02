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
				System.out.println("Programa finalizado!");
				break;
			
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} while(opcao != 0);
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
		double comprimento = sc.nextFloat();
		System.out.print("Velocidade: ");
		double velocidade = sc.nextFloat();
		sc.nextLine();
		animalAtivo = new Peixe(nome, comprimento, velocidade);
		animais.add(animalAtivo);
	}
	
	public static void incluirMamifero() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Comprimento: ");
		double comprimento = sc.nextFloat();
		sc.nextLine();
		System.out.print("Cor: ");
		String cor = sc.nextLine();
		System.out.print("Velocidade: ");
		double velocidade = sc.nextDouble();
		sc.nextLine();
		animalAtivo = new Mamifero(nome, comprimento, cor, velocidade);
		animais.add(animalAtivo);
	}
	
	public static void listarAnimais() {
		for (Animal animal : animais) {
			System.out.println(animal);
		}
	}
	
	public static void listarPeixes() {
		for(Animal animal: animais) {
			if(animal instanceof Peixe) {
				animal = (Peixe) animal;
				System.out.println(animal);
			}
		}
	}

}
