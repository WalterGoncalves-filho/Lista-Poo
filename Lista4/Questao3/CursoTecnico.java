package Lista4.Questao3;

public class CursoTecnico extends Curso {

    public CursoTecnico(String nome, int duracao, double valorMensalidade) {
        super(nome, duracao, valorMensalidade);
    }

    @Override
    public double calcularDesconto() {
        // 10% de desconto
        return getValorMensalidade() * 0.10;
    }
}
