package Lista4.Questao5;

public class SUV extends Veiculo {

    public SUV(String modelo, String placa, double valorBaseDiaria) {
        super(modelo, placa, valorBaseDiaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        return (getValorBaseDiaria() + 50) * dias;
    }
}

