package Lista5.Questao10;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Evento evento = new Evento();
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Sistema de Registro de Evento ===");
            System.out.println("1. Registrar participante");
            System.out.println("2. Listar participantes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 : 
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(scanner.nextLine());
                    System.out.print("Tipo de ingresso (VIP, Pista, Meia): ");
                    String ingresso = scanner.nextLine();

                    evento.adicionarParticipante(new Participante(nome, ingresso, idade));
                    System.out.println("Participante registrado com sucesso.");
                    break;
                case 2 : evento.listarParticipantes(); break;
                case 0 : System.out.println("Encerrando sistema..."); break;
                default : System.out.println("Opção inválida."); break;
            }
        } while (opcao != 0);
    }
}

