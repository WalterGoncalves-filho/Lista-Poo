package Lista6.Questao2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int opcao;
        do {
            System.out.println("\n=== Calculadora ===");
            System.out.println("1. Somar dois números");
            System.out.println("2. Calcular área do círculo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 : {
                    System.out.print("Digite o primeiro número: ");
                    double n1 = Double.parseDouble(scanner.nextLine());
                    System.out.print("Digite o segundo número: ");
                    double n2 = Double.parseDouble(scanner.nextLine());
                    double resultado = calc.somar(n1, n2);
                    System.out.println("Resultado da soma: " + resultado);
                } break;
                case 2 : {
                    System.out.print("Digite o raio do círculo: ");
                    double raio = Double.parseDouble(scanner.nextLine());
                    double area = calc.calcularAreaCirculo(raio);
                    System.out.println("Área do círculo: " + area);
                } break;
                case 0 : System.out.println("Encerrando..."); break;
                default : System.out.println("Opção inválida!"); break;
            }
        } while (opcao != 0);
    }
}
