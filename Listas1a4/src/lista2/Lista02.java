package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Lista02 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		questao9V2();

	}
	
	static void questao1() {
		float numeros[], soma;
		numeros = new float[10];
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros[i] = scan.nextFloat();
		}
		for (float valor: numeros) {
			soma += valor;
		}
		System.out.println("A soma dos valores digitados é " + soma);
		
	}
	
	static void questao2() {
		float numeros[], soma, media, maior, menor;
		numeros = new float[10];
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			float num =  scan.nextFloat();
			numeros[i] = num;
			soma += num;
		}
		Arrays.sort(numeros);
		maior = numeros[9];
		menor = numeros[0];
		media = soma / numeros.length;
		System.out.println("O maior valor digitado é " + maior);
		System.out.println("O menor valor digitado é " + menor);
		System.out.println("A média dos valores digitados é " + media);
	}
	
	static void questao3() {
		float notas[], soma, media;
		int acimaMedia = 0;
		notas = new float[10];
		soma = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + "ª nota: ");
			float nota =  scan.nextFloat();
			notas[i] = nota;
			soma += nota;
			if (nota > 7) {
				acimaMedia++;
			}
		}
		media = soma / notas.length;
		System.out.println("A média das notas é " + media);
		System.out.println(acimaMedia + " alunos ficaram acima da média!");
	}
	
	static void questao4() {
		int numeros[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros[i] = scan.nextInt();
		}
		System.out.println("Os números digitados na ordem inversa:");
		for (int i = 9;i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	static void questao5() {
		int quantidade;
		System.out.print("Quantos nomes serão salvos? ");
		quantidade = scan.nextInt();
		String nomes[] = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.print("Digite o " + (i+1) + "º nome: ");
			nomes[i] = scan.next();
		}
		String consulta;
		System.out.print("Qual nome deseja consultar? ");
		consulta = scan.next();
		if(Arrays.binarySearch(nomes, consulta) >= 0) {
			System.out.println("O nome está na lista!");
		} else {
			System.out.println("O nome não está na lista.");
		}
	}
	
	static void questao6() {
		//int[] vetor1 = new int[5], vetor2 = new int[5];
		
		int[] vetor1 = {0,1,2,3,4}, vetor2 = {0,1,2,3,4};
		boolean igual = true;
		
		if (Arrays.equals(vetor1, vetor2)) {
			System.out.println("vetores iguais");
		} else {
			System.out.println("vetores diferente");
		}
		for (int i = 0; i < 5; i++) {
			if (vetor1[i] != vetor2[i]) {
				igual = false;
			}
		}
		if (igual) {
			System.out.println("vetores iguais");			
		} else {
			System.out.println("vetores diferente");
		}
	}
	
	static void questao7() {
		String frase;
		
		System.out.print("Digite uma frase: ");
		frase = scan.nextLine();
		
		for (int i = (frase.length() - 1); i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
	}
	
	static void questao8() {
		System.out.print("Digite uma frase: ");
		String frase = scan.nextLine();
		System.out.println("A frase tem " + frase.length() + " caracteres");
	}
	
	static void questao9() {
		System.out.print("Digite uma palavra: ");
		String frase = scan.nextLine();
		char[] letras = frase.toCharArray();
		int cont = 0;
		for (char letra: letras) {
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'i' || letra == 'o' || letra == 'u') {
				cont++;
			}
		}
		System.out.println("A palavra tem " + cont + " vogais");
	}
	
	private static boolean contem (char[] vetor, char comparacao) {
		boolean result = false;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == comparacao) {
				result = true;
			}
		}
		
		return result;
	}
	
	static void questao9V2() {
		System.out.print("Digite uma palavra: ");
		String palavra = scan.nextLine();
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		int contador = 0;
		
		palavra.toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++) {
			if (contem(vogais, palavra.charAt(i))) {
				contador++;
			}
		}
		System.out.println("A palavra '" + palavra + "' tem " + contador + " vogais");
	}

}
