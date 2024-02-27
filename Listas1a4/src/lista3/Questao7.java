package lista3;

import java.util.Scanner;

public class Questao7 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Quantos valores serão digitados: ");
		int quant = sc.nextInt();
		float valores[] = new float[quant];
		for (int i = 0; i < quant; i++) {
			System.out.print("Informe o " + (i + 1) + "º valor: ");
			valores[i] = sc.nextFloat();
		}
		
		System.out.println("A média dos valores digitados é " + media(valores));
	}

	private static float media(float[] valores) {
		float soma = 0, result;
		for (float valor: valores) {
			soma += valor;
		}
		result = soma / valores.length;
		return result;
	}
}
