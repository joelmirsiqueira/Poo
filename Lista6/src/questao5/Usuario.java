package questao5;

import java.util.Scanner;

public class Usuario {
	public static Scanner sc = new Scanner(System.in);
	public static Carro carroAtivo;
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();

		} while(opcao != 4);
	}
	public static int menu() {
		int opcao;
		String[] opcoes = {"Andar", "Reabastecer", "Verificar Quantidade de combustível", "Encerrar viagem"};
		System.out.println("Menu:");
		for(int i = 1; i <= opcoes.length; i++){
			System.out.println(i + ". " + opcoes[i-1]);

		}
		System.out.println("");
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
}
