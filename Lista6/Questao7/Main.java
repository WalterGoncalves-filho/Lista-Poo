package Lista6.Questao7;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ManipuladorDeTexto manipulador = new ManipuladorDeTexto();

        System.out.println("\n\n=== Manipulador de Texto ===");
        System.out.print("Digite um texto: ");
        String entrada = scanner.nextLine();

        String invertido = manipulador.inverterTexto(entrada);
        int quantidade = manipulador.contarCaracteres(entrada);

        System.out.println("\nTexto invertido: " + invertido);
        System.out.println("Quantidade de caracteres: " + quantidade);
    }
}

