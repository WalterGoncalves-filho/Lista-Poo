package Lista4.Questao10;

public class PlanoFamilia extends PlanoAssinatura {
    public PlanoFamilia(String nomeUsuario) {
        super(nomeUsuario, 34.90);
    }

    @Override
    public String getBeneficios() {
        return "Acesso com múltiplos perfis e conteúdo HD.";
    }
}

