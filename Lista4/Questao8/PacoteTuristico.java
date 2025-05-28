package Lista4.Questao8;

public class PacoteTuristico extends PacoteViagem {
    public PacoteTuristico(String cliente, String destino) {
        super(cliente, destino, 1999.90);
    }

    @Override
    public String getDescricao() {
        return "Hospedagem confortável + passeios inclusos.";
    }
}
