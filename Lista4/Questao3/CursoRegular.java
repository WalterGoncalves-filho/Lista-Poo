package Lista4.Questao3;

public class CursoRegular extends Curso {

    public CursoRegular(String nome, int duracao, double valorMensalidade) {
        super(nome, duracao, valorMensalidade);
    }

    @Override
    public double calcularDesconto() {
        return getValorMensalidade() * 0.05;
    }
}

