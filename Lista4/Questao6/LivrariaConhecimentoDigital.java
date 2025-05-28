package Lista4.Questao6;

public class LivrariaConhecimentoDigital {
    public static void main(String[] args) {
        Livro livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 89.90, 750);
        Livro livro2 = new Ebook("Clean Code", "Robert C. Martin", 49.90, "PDF", true);
        Livro livro3 = new Audiobook("1984", "George Orwell", 59.90, 11.5, "Carlos Machado");

        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
        System.out.println();
        livro3.exibirDetalhes();
    }
}

