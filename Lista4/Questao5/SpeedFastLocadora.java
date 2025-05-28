package Lista4.Questao5;

public class SpeedFastLocadora {
    public static void main(String[] args) {
        Veiculo eco = new CarroEconomico("Fiat Mobi", "ABC-1234", 100.0);
        Veiculo suv = new SUV("Hyundai Creta", "DEF-5678", 200.0);
        Veiculo premium = new VeiculoPremium("BMW Série 3", "GHI-9012", 350.0);

        int dias = 10;

        System.out.println("\n\n=== Carro Econômico ===");
        eco.exibirInfo();
        System.out.printf("Valor do aluguel por %d dias: R$ %.2f\n", dias, eco.calcularAluguel(dias));

        System.out.println("\n=== SUV ===");
        suv.exibirInfo();
        System.out.printf("Valor do aluguel por %d dias: R$ %.2f\n", dias, suv.calcularAluguel(dias));

        System.out.println("\n=== Veículo Premium ===");
        premium.exibirInfo();
        System.out.printf("Valor do aluguel por %d dias: R$ %.2f\n", dias, premium.calcularAluguel(dias));
    }
}
