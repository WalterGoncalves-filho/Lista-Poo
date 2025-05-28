package Lista4.Questao6;

public class Audiobook extends Livro {
    private double duracao; // em horas
    private String narrador;

    public Audiobook(String titulo, String autor, double preco, double duracao, String narrador) {
        super(titulo, autor, preco);
        this.duracao = duracao;
        this.narrador = narrador;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Audiobook: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Duração: " + duracao + " horas");
        System.out.println("Narrador: " + narrador);
    }
}

