package lista3;

import java.util.Scanner;

public class Questao5 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		float base, altura;
		int opcao;
		System.out.println("Digite a base e a altura do retângulo: ");
		base = sc.nextFloat();
		altura = sc.nextFloat();
		
		System.out.println("Deseja calcular:");
		System.out.println("1. área;");
		System.out.println("2. perimetro;");
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("A área do retângulo é " + area(base, altura));
			break;
		case 2:
			System.out.println("O perimetro do retângulo é " + perimetro(base, altura));
			break;
		default:
			System.out.println("ERRO! Opção invalida!");
		}
		
	}

	private static float area(float base, float altura) {
		return base * altura;
	}
	
	protected static float perimetro(float base, float altura) {
		return 2 * base + 2 * altura;
	}
}
