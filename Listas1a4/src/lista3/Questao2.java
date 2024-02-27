package lista3;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float numeros[] = new float[2];
		for (int i = 0; i < 2; i++) {
			System.out.print("Digite o " + (i+1) + "º  número: ");
			numeros[i] = scan.nextFloat();
		}
		System.out.print("Escolha a opração [ + - * / ]: ");
		char operacao = scan.next().charAt(0);
		scan.close();
		float resultado;
		switch (operacao) {
		case '+':
			resultado = somar(numeros[0], numeros[1]);
			break;
		case '-':
			resultado = subtrair(numeros[0], numeros[1]);
			break;
		case '*':
			resultado = multiplicar(numeros[0], numeros[1]);
			break;
		case '/':
			resultado = dividir(numeros[0], numeros[1]);
			break;
		default:
			resultado = 0;
		}
		System.out.printf("O resultado de '%.2f %c %.2f' é %.2f", numeros[0], operacao, numeros[1], resultado);
	}

	public static float somar(float num1, float num2) {
		float result = num1 + num2;
		return result;
	}

	public static float subtrair(float num1, float num2) {
		float result = num1 - num2;
		return result;
	}
	
	public static float multiplicar(float num1, float num2) {
		float result = num1 * num2;
		return result;
	}

	public static float dividir(float num1, float num2) {
		float result = num1 / num2;
		return result;
	}

}
