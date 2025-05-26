package Lista1.Questao_5;

public class Carro extends Veiculo {
    private int numeroDePortas;
    private boolean temArCondicionado;

    public Carro(String marca, String modelo, int ano, int numeroDePortas, boolean temArCondicionado) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.temArCondicionado = temArCondicionado;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Ar-condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }
}

