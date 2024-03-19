package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	public static Scanner sc = new Scanner(System.in);
	public static Livro livroAtivo;
	public static List<Livro> livros = new ArrayList<>();
	public static void main(String[] args) {
		int opcao;
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

			case 0:
				encerrar();
				break;
				
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while(opcao != 0);
	}
	public static int menu() {
		int opcao;
		String[] opcoes = {"Cadastrar livro", "Buscar livro", "Listar livros por autor", "Listar todos os livros", "Sair"};
		System.out.println("Menu:");
		for(int i = 0; i < opcoes.length; i++){
			if(opcoes[i].equals("Sair")) {
				System.out.println("0. " + opcoes[i]);
			} else {
				System.out.println((i+1) + ". " + opcoes[i]);
			}
		}
		System.out.println("");
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}
	
	public static void encerrar() {
		System.out.println("Programa finalizado.");
	}
}
