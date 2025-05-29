package Lista6.Questao5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        Usuario usuario = new Usuario("admin", "1234");
        System.out.println("\n\n\n=== Sistema de Autenticação ===");
        System.out.print("Digite seu nome de usuário: ");
        String nomeDigitado = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        if (usuario.getNome().equals(nomeDigitado) && usuario.autenticar(senhaDigitada)) {
            System.out.println("Autenticação bem-sucedida. Bem-vindo, " + usuario.getNome() + "!");
        } else {
            System.out.println("Falha na autenticação. Verifique seu nome de usuário ou senha.");
        }
    }
}
