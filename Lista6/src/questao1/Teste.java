package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList();

        do {
            System.out.println("Opções: ");
            System.out.println("1. Cadastrar um funcionário");
            System.out.println("2. Exibir os funcionários de alta renda");
            System.out.println("0. Sair");
            System.out.println("");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Salário: ");
                    Double salario = sc.nextDouble();
                    sc.nextLine();
                    Funcionario f1 = new Funcionario(nome, salario);
                    funcionarios.add(f1);
                    System.out.println("Funcionário " + f1.getNome() + " cadastrado com sucesso!");
                    break;
            
                case 2:
                    System.out.println("Funcionários de alta renda:");
                    for (Funcionario funcionario : funcionarios) {
                        if(funcionario.getSalario() > 5000){
                            System.out.println(funcionario.getNome() + ";");
                        }
                    }
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
}
