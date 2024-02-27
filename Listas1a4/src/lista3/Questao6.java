package lista3;

import java.util.Scanner;

public class Questao6 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		float temperatura;
		System.out.println("Escolha a opção:");
		System.out.println("1. Transformar de Fahrenheit para Celsius");
		System.out.println("2. Transformar de Kelvin para Celsius");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.print("Informe a temperatura: ");
			temperatura = sc.nextFloat();
			System.out.println("A tempetarura em Celcius é " + fahrenheit(temperatura));
			break;
			
		case 2:
			System.out.print("Informe a temperatura: ");
			temperatura = sc.nextFloat();
			System.out.println("A tempetarura em Celcius é " + kelvin(temperatura));
			break;
			
		default:
			System.out.println("ERRO! Opção invalida.");
			break;
		}
	}

	private static float kelvin(float temperatura) {
		return temperatura - 273;
	}

	private static float fahrenheit(float temperatura) {
		return (5 * (temperatura - 32) / 9);
	}
}
