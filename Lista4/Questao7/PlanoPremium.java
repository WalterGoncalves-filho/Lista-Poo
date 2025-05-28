package Lista4.Questao7;

public class PlanoPremium extends PlanoTreino {
    public PlanoPremium(String nomeCliente) {
        super(nomeCliente, 249.90);
    }

    @Override
    public String getBeneficios() {
        return "Musculação + Aulas em grupo + Personal trainer + Nutrição exclusiva.";
    }
}

