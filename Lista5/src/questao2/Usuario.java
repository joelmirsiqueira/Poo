package questao2;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo re = new Retangulo(0, 0);
		int opcao;
		float base, altura;
	
		do {
			System.out.println("Menu:");
			System.out.println("1. Criar um retângulo");
			System.out.println("2. Calcular Área");
			System.out.println("3. Calcular Perímetro");
			System.out.println("0. Sair");
			System.out.println("");
			System.out.print("Digite o número da opção: ");
			opcao = sc.nextInt();
			System.out.println();
			
			switch (opcao) {
			case 1:
				System.out.print("informe o valor da base: ");
				base = sc.nextFloat();
				System.out.print("informe o valor da altura: ");
				altura = sc.nextFloat();
				sc.close();
				re.setAltura(altura);
				re.setBase(base);
				break;
				
			case 2:
				System.out.println("A área do retângulo é: " + re.area());
				break;
				
			case 3:
				System.out.println("O perímetro do retângulo é: " + re.perimetro());
				break;
				
			case 0:
				System.out.println("Programa finalizado.");
				break;

			default:
				System.out.println("Opção invalida!");
				break;
			}
			System.out.println();
			
		} while(opcao != 0);
		
		
	}
	
}
