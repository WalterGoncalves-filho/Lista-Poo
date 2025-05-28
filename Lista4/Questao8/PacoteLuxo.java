package Lista4.Questao8;

public class PacoteLuxo extends PacoteViagem {
    public PacoteLuxo(String cliente, String destino) {
        super(cliente, destino, 3999.90);
    }

    @Override
    public String getDescricao() {
        return "Hospedagem 5 estrelas + passeios exclusivos + traslado privativo + refeições gourmet.";
    }
}

