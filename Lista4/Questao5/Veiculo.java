package Lista4.Questao5;

public abstract class Veiculo {
    private String modelo;
    private String placa;
    private double valorBaseDiaria;

    public Veiculo(String modelo, String placa, double valorBaseDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.printf("Valor base da diária: R$ %.2f\n", valorBaseDiaria);
    }

    public abstract double calcularAluguel(int dias);
}

