package Lista5.Questao9;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {   
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Hotel hotel = new Hotel(); 
        int opcao;
        do {
            System.out.println("\n=== Sistema de Reservas do Hotel ===");
            System.out.println("1. Fazer reserva");
            System.out.println("2. Listar reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 : 
                    System.out.println("\n\n------- Sistema de Hospedagem ----------");
                    System.out.print("Nome do hóspede: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número do quarto: ");
                    int quarto = Integer.parseInt(scanner.nextLine());
                    System.out.print("Data de entrada (AAAA-MM-DD): ");
                    LocalDate entrada = LocalDate.parse(scanner.nextLine());
                    System.out.print("Data de saída (AAAA-MM-DD): ");
                    LocalDate saida = LocalDate.parse(scanner.nextLine());

                    if (saida.isBefore(entrada)) {
                        System.out.println("Data de saída deve ser após a data de entrada.");
                    } else if (hotel.fazerReserva(nome, quarto, entrada, saida)) {
                        System.out.println("Reserva feita com sucesso!");
                    } else {
                        System.out.println("Quarto indisponível nesse período.");
                    }
                    break;
                case 2 : 
                    System.out.println("\n\n----------");
                    hotel.listarReservas(); break;
                case 0 : System.out.println("Encerrando sistema..."); break;
                default : System.out.println("Opção inválida!"); break;
            } 
        } while (opcao != 0);
    }
}
