package Lista4.Questao8;

public abstract class PacoteViagem {
    private String destino;
    private double preco;
    private String cliente;

    public PacoteViagem(String cliente, String destino, double preco) {
        this.cliente = cliente;
        this.destino = destino;
        this.preco = preco;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String getDescricao();
}

