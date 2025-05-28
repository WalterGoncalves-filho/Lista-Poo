package Lista4.Questao8;

public class PacoteEconomico extends PacoteViagem {
    public PacoteEconomico(String cliente, String destino) {
        super(cliente, destino, 999.90);
    }

    @Override
    public String getDescricao() {
        return "Hospedagem simples + café da manhã.";
    }
}
