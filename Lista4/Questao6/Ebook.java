package Lista4.Questao6;

public class Ebook extends Livro {
    private String formato; // ex: PDF, EPUB
    private boolean temRecursosDigitais;

    public Ebook(String titulo, String autor, double preco, String formato, boolean temRecursosDigitais) {
        super(titulo, autor, preco);
        this.formato = formato;
        this.temRecursosDigitais = temRecursosDigitais;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("E-Book: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Formato: " + formato);
        System.out.println("Recursos digitais exclusivos: " + (temRecursosDigitais ? "Sim" : "Não"));
    }
}

