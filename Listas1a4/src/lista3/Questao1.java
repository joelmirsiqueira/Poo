package lista3;

import java.util.Scanner;

public class Questao1 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Digite um número natural diferente de zero: ");
		int num = scan.nextInt();
		parOuImpar(num);
	}

	private static void parOuImpar(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " é par.");
		} else {
			System.out.println(num + " é ímpar.");
		}
	}
}
