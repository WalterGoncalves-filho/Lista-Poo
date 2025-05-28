package Lista4.Questao3;

public class CursoProfissionalizante extends Curso {

    public CursoProfissionalizante(String nome, int duracao, double valorMensalidade) {
        super(nome, duracao, valorMensalidade);
    }

    @Override
    public double calcularDesconto() {
        return getValorMensalidade() * 0.15;
    }

    public void beneficioExtra() {
        System.out.println("Benefício: Material didático gratuito incluído.");
    }
}
