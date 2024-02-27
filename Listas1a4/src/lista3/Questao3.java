package lista3;

import java.util.Scanner;

public class Questao3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Digite uma palavra: ");
		String palavra = sc.next();
		System.out.println("A palavra '" + palavra + "' tem " + contVogais(palavra) + " vogais.");
	}
	
	public static int contVogais(String texto) {
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		int cont = 0;
		for (int i = 0; i < texto.length(); i++) {
			for (char vogal: vogais) {
				if (texto.charAt(i) == vogal) {
					cont++;
				}
			}
		}
		return cont;
	}
}
