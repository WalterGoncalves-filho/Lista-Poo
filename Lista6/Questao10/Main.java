package Lista6.Questao10;

public class Main {
    static Biblioteca biblioteca = new Biblioteca();
    public static void main(String[] args) {

        biblioteca.adicionarItem(new Livro("Dom Quixote", "Miguel de Cervantes"));
        biblioteca.adicionarItem(new Livro("1984", "George Orwell"));
        biblioteca.adicionarItem(new Revista("Super Interessante", 320));

        biblioteca.listarItens();

        System.out.println("\n-- Empréstimos --");
        biblioteca.emprestarItem("1984");
        biblioteca.emprestarItem("Super Interessante");

        System.out.println("\n-- Situação Atual --");
        biblioteca.listarItens();

        System.out.println("\n-- Devoluções --");
        biblioteca.devolverItem("1984");

        System.out.println("\n-- Situação Final --");
        biblioteca.listarItens();
    }
}
