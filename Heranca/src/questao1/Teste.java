package questao1;

import java.util.Scanner;

public class Teste {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int opcao;
		float eficiencia;
		System.out.print("Eficiência do carro: ");
		eficiencia = sc.nextFloat();
		sc.nextLine();
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				
				break;

			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;

			case 5:
				
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while(opcao != 4);
	}
	public static int menu() {
		int opcao;
		String[] opcoes = {"Incluir dados"};
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
}
