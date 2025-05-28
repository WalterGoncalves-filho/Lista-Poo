package Lista5.Questao4;
public class Biblioteca {
    private Livro[] livros;
    private int quantidade;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        quantidade = 0;
    }

    public boolean adicionarLivro(Livro livro) {
        if (quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
            return true;
        }
        return false;
    }

    // Método encapsulado para buscar um livro pelo título
    public Livro buscarPorTitulo(String tituloBusca) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(tituloBusca)) {
                return livros[i];
            }
        }
        return null; // Não encontrado
    }
}

