package Lista4.Questao9;

public class PratoALaCarte extends ItemCardapio {
    public PratoALaCarte(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getDescricao() {
        return "Prato individual preparado na hora.";
    }
}

