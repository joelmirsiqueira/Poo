package lista3;

import java.util.Scanner;

public class Questao4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Digite o salário: ");
		float salario = sc.nextFloat();
		
		System.out.printf("Este salário paga R$ %.2f de impostos", imposto(salario));
	}

	public static float imposto(float salario) {
		float valorImposto;
		if (salario <= 2000) {
			valorImposto = 0;
		} else if (salario > 2000 && salario <= 3500) {
			valorImposto = salario * 0.15f;
		} else if (salario > 3500 && salario <= 5000) {
			valorImposto = salario * 0.22f;
		} else {
			valorImposto = salario * 0.30f;
		}
		return valorImposto;
	}
}
