package Lista4.Questao5;

public class VeiculoPremium extends Veiculo {
    public VeiculoPremium(String modelo, String placa, double valorBaseDiaria) {
        super(modelo, placa, valorBaseDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = getValorBaseDiaria() * dias;
        valor += valor * 0.2 + 100;
        return valor;
    }
}

