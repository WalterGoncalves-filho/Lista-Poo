package Lista4.Questao10;

public class PlanoPremium extends PlanoAssinatura {
    public PlanoPremium(String nomeUsuario) {
        super(nomeUsuario, 49.90);
    }

    @Override
    public String getBeneficios() {
        return "Conteúdo em 4K + Acesso antecipado a lançamentos.";
    }
}

