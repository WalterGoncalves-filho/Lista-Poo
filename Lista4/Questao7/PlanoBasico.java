package Lista4.Questao7;

public class PlanoBasico extends PlanoTreino {
    public PlanoBasico(String nomeCliente) {
        super(nomeCliente, 99.90);
    }

    @Override
    public String getBeneficios() {
        return "Acesso à musculação.";
    }
}
