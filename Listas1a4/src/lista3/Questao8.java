package lista3;

import java.util.Scanner;

public class Questao8 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idades[] = new int[10];
		String nomes[] = new String[10];
		int opcao;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o nome da " + (i+1) + "ª pessoa: ");
			nomes[i] = sc.next();
			System.out.print("Informe a idade da " + (i+1) + "ª pessoa: ");
			idades[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Deseja saber:");
		System.out.println("1. O nome da pessoa mais velha");
		System.out.println("2. O nome da pessoa mais nova");
		System.out.println("3. O numero de pessoas com mais de 18 anos");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("O nome da pessoa mais velha é " + maisVelha(nomes, idades));
			break;

		case 2:
			System.out.println("O nome da pessoa mais nova é " + maisNova(nomes, idades));
			break;
			
		case 3:
			System.out.println("O número de pessoas com mais de 18 anos é " + maiorIdade(idades));
			break;
			
		default:
			System.out.println("ERRO! Opção invalida.");
			break;
		}
	}

	private static String maisVelha(String[] nomes, int[] idades) {
		int maisVelha = 0;
		String nome = "";
		
		for (int i = 0; i < 10; i++) {
			if (idades[i] > maisVelha) {
				maisVelha = idades[i];
				nome = nomes[i];
			} else if (idades[i] == maisVelha) {
				nome += " e " + nomes[i];
			}
		}
		return nome;
	}
	
	private static String maisNova(String[] nomes, int[] idades) {
		int maisNova = idades[0];
		String nome = "";
		
		for (int i = 0; i < 10; i++) {
			if (idades[i] < maisNova) {
				maisNova = idades[i];
				nome = nomes[i];
			} else if (idades[i] == maisNova) {
				nome += " e " + nomes[i];
			}
		}
		return nome;
	}
	
	private static int maiorIdade(int idades[]) {
		int cont = 0;
		for (int idade: idades) {
			if (idade > 18) {
				cont++;
			}
		}
		return cont;
	}
	
}
