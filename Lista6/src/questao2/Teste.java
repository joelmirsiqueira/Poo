package questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
	private static Scanner sc = new Scanner(System.in);
    private static List<Estudante> estudantes = new ArrayList<Estudante>();
    private static Estudante selecionado;

	public static void main(String[] args) {
		int opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case 1:
                	cadastrarEstudante();
                    break;
                    
                case 2:
                    buscaEstudante();
                    break;

                case 3:
                	calcularMedia();
                    break;

                case 0:
                    System.out.println("Programa finalizado");
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
                }
        } while(opcao != 0);
	}
	public static int menu() {
		int opcao;
		System.out.println("Opções: ");
        System.out.println("1. Cadastrar um estudante");
        System.out.println("2. Obter o nome do estudante");
        System.out.println("3. Calcular média");
        System.out.println("0. Sair");
        opcao = sc.nextInt();
        sc.nextLine();
		return opcao;
	}
	public static void cadastrarEstudante() {
		System.out.println("Matrícula: ");
    	int matricula = sc.nextInt();
    	sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        float notas[] = new float[2];
        for(int i = 0; i < 2; i++) {
        	System.out.print("Nota " + (i+1) + ": ");
        	notas[i] = sc.nextFloat();
        	sc.nextLine();
        }
    	selecionado = new Estudante(matricula, nome, notas);
        estudantes.add(selecionado);
        System.out.println("Estudante " + selecionado.getNome() + " cadastrado com sucesso!");
	}
    public static void buscaEstudante() {
    	System.out.println("Matricula do estudante: ");
        int mat = sc.nextInt();
        sc.nextLine();
        for (Estudante estudante : estudantes) {
            if(estudante.getMatricula() == mat){
                selecionado = estudante;
            }
        }
        System.out.println("Nome do estudante: " + selecionado.getNome());
    }
    private static void calcularMedia() {
        float media = selecionado.media();
    	System.out.println("A média do estudante é " + selecionado.media());
        if(media >= 7) {
        	System.out.println("Aluno aprovado");
        } else {
        	System.out.println("Aluno reprovado");
        }
        System.out.println("");
	}
}
