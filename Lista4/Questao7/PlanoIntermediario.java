package Lista4.Questao7;

public class PlanoIntermediario extends PlanoTreino {
    public PlanoIntermediario(String nomeCliente) {
        super(nomeCliente, 149.90);
    }

    @Override
    public String getBeneficios() {
        return "Acesso à musculação + Aulas em grupo.";
    }
}

