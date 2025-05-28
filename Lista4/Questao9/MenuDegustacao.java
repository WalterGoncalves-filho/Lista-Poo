package Lista4.Questao9;

public class MenuDegustacao extends ItemCardapio {
    public MenuDegustacao(String nome) {
        super(nome, 249.90);
    }

    @Override
    public String getDescricao() {
        return "Menu degustação com experiência gastronômica exclusiva em 5 etapas.";
    }
}
