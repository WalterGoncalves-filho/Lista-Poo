package Lista5.Questao7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Time> times = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n===== Menu do Campeonato =====");
            System.out.println("1. Criar Time");
            System.out.println("2. Adicionar Jogador");
            System.out.println("3. Remover Jogador");
            System.out.println("4. Listar Times");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1 : criarTime(); break;
                case 2 : adicionarJogador(); break;
                case 3 : removerJogador(); break;
                case 4 : listarTimes(); break;
                case 0 : System.out.println("Encerrando o sistema."); break;
                default:  System.out.println("Opção inválida!"); break;
            }
        } while (opcao != 0);
    }

    public static void criarTime() {
        System.out.print("Nome do time: ");
        String nome = entrada.nextLine();
        times.add(new Time(nome));
        System.out.println("Time criado com sucesso!");
    }

    public static void adicionarJogador() {
        System.out.print("Nome do time: ");
        String nomeTime = entrada.nextLine();

        Time time = buscarTime(nomeTime);
        if (time != null) {
            System.out.print("Nome do jogador: ");
            String jogador = entrada.nextLine();
            time.adicionarJogador(jogador);
            System.out.println("Jogador adicionado!");
        } else {
            System.out.println("Time não encontrado.");
        }
    }

    public static void removerJogador() {
        System.out.print("Nome do time: ");
        String nomeTime = entrada.nextLine();

        Time time = buscarTime(nomeTime);
        if (time != null) {
            System.out.print("Nome do jogador a remover: ");
            String jogador = entrada.nextLine();
            if (time.removerJogador(jogador)) {
                System.out.println("Jogador removido.");
            } else {
                System.out.println("Jogador não encontrado no time.");
            }
        } else {
            System.out.println("Time não encontrado.");
        }
    }

    public static void listarTimes() {
        if (times.isEmpty()) {
            System.out.println("Nenhum time cadastrado.");
        } else {
            for (Time time : times) {
                System.out.println("\n" + time);
            }
        }
    }

    private static Time buscarTime(String nome) {
        for (Time t : times) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                return t;
            }
        }
        return null;
    }
}
