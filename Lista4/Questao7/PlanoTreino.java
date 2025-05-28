package Lista4.Questao7;

// Classe Abstrata - Abstração
public abstract class PlanoTreino {
    private String nomeCliente;
    private double preco;

    public PlanoTreino(String nomeCliente, double preco) {
        this.nomeCliente = nomeCliente;
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getBeneficios();
}
