package questao5;

import java.util.Scanner;

public class Usuario {
	public static Scanner sc = new Scanner(System.in);
	public static Carro carroAtivo;
	public static void main(String[] args) {
		int opcao;
		float eficiencia;
		System.out.print("Eficiência do carro: ");
		eficiencia = sc.nextFloat();
		sc.nextLine();
		carroAtivo = new Carro(eficiencia);
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				andar();
				break;

			case 2:
				reabastecer();
				break;
				
			case 3:
				verificarCombustivel();
				break;
				
			case 4:
				encerrar();
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}
		} while(opcao != 4);
	}
	public static int menu() {
		int opcao;
		String[] opcoes = {"Andar", "Reabastecer", "Verificar Quantidade de combustível", "Encerrar viagem"};
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
	public static void andar() {
		float distancia;
		System.out.print("Quilometragem a ser percorrida: ");
		distancia = sc.nextFloat();
		sc.nextLine();
		carroAtivo.andar(distancia);
	}
	public static void reabastecer() {
		float combustivel;
		System.out.print("Quantidade de combustível: ");
		combustivel = sc.nextFloat();
		sc.nextLine();
		carroAtivo.reabastecer(combustivel);
	}
	public static void verificarCombustivel() {
		System.out.println("Restão " + carroAtivo.getCombustivel() + " litros de combustível.");
	}
	public static void encerrar() {
		System.out.println("Programa finalizado.");
	}
}
