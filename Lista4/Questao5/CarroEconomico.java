package Lista4.Questao5;

public class CarroEconomico extends Veiculo {

    public CarroEconomico(String modelo, String placa, double valorBaseDiaria) {
        super(modelo, placa, valorBaseDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = getValorBaseDiaria() * dias;
        if (dias > 7) {
            valor *= 0.9;
        }
        return valor;
    }
}
