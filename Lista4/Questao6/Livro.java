package Lista4.Questao6;

public abstract class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPreco() { return preco; }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void exibirDetalhes();
}

