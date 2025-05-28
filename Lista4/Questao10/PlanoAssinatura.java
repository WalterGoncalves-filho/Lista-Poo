package Lista4.Questao10;

public abstract class PlanoAssinatura {
    private String nomeUsuario;
    private double precoMensal;

    public PlanoAssinatura(String nomeUsuario, double precoMensal) {
        this.nomeUsuario = nomeUsuario;
        this.precoMensal = precoMensal;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public double getPrecoMensal() {
        return precoMensal;
    }

    public abstract String getBeneficios();
}

