package Lista4.Questao6;

public class LivroFisico extends Livro {
    private double peso; // em gramas

    public LivroFisico(String titulo, String autor, double preco, double peso) {
        super(titulo, autor, preco);
        this.peso = peso;
    }

    public double getPeso() { return peso; }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n");
        System.out.println("-------------------------");
        System.out.println("Livro Físico: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Peso: " + peso + "g");
        System.out.println("-------------------------");
    }
}

