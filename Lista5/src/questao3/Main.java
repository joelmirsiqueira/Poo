package questao3;

import java.util.Scanner;

public class Main {
    private static Circulo c1 = new Circulo(0);
    
    public static void main(String[] args) {
        int opcao;
        do{
            opcao = memu();
        } while(opcao != 0);
    }
    public static int memu() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        System.out.println("Escolha a opção:");
        System.out.println("1. Criar circulo");
        System.out.println("2. Caucular área");
        System.out.println("3. Calcular perímetro");
        System.out.println("0. Sair");
        
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Raio do círculo: ");
                double raio = sc.nextDouble();
                c1 = new Circulo(raio);
                break;
            case 2:
                System.out.println("Área = " + c1.area());
                break;
            case 3:
                System.out.println("Perímetro = " + c1.perimetro());
                break;
            case 0:
                System.out.println("Programa Finalizado!");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        return opcao;
    }
}