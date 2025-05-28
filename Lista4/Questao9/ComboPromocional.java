package Lista4.Questao9;

public class ComboPromocional extends ItemCardapio {
    public ComboPromocional(String nome, double precoOriginal) {
        super(nome, precoOriginal * 0.85); // 15% de desconto
    }

    @Override
    public String getDescricao() {
        return "Combo promocional com bebida e acompanhamento. (15% OFF)";
    }
}

