package Lista1.Questao_5;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4, true);
        Moto moto = new Moto("Honda", "CB 500", 2021, 500, true);

        System.out.println("=== Informações do Carro ===");
        carro.exibirInformacoes();

        System.out.println("\n=== Informações da Moto ===");
        moto.exibirInformacoes();
    }
}
