package Lista4.Questao10;

public class PlanoBasico extends PlanoAssinatura {
    public PlanoBasico(String nomeUsuario) {
        super(nomeUsuario, 19.90);
    }

    @Override
    public String getBeneficios() {
        return "Acesso a filmes em qualidade padrão (SD).";
    }
}

