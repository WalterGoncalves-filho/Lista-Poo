package Lista5.Questao4;

import java.util.Scanner;

public class SisBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5); // até 5 livros

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", "9788572326974");
        Livro l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "9788595080802");
        Livro l3 = new Livro("Capitães da Areia", "Jorge Amado", "9788520932078");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro a buscar: ");
        String tituloBusca = scanner.nextLine();

        Livro resultado = biblioteca.buscarPorTitulo(tituloBusca);
        if (resultado != null) {
            System.out.println("Livro encontrado:");
            resultado.exibirInfo();
        } else {
            System.out.println("Livro não encontrado.");
        }

        scanner.close();
    }
}
