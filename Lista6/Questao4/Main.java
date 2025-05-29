package Lista6.Questao4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Escolha a categoria:");
        for (Categoria c : Categoria.values()) {
            System.out.println("- " + c);
        }

        Categoria categoria = null;
        while (categoria == null) {
            try {
                System.out.print("Digite exatamente como mostrado: ");
                String entrada = scanner.nextLine().toUpperCase();
                categoria = Categoria.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("Categoria inválida. Tente novamente.");
            }
        }

        Livro livro = new Livro(titulo, autor, categoria);
        System.out.println("\nLivro cadastrado com sucesso:\n" + livro);
    }
}
