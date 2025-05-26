package Lista1.Questao_3;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        Veiculo carro = new Veiculo();
        setarValores(carro);
        exibirValores(carro);

    }

    public static void setarValores(Veiculo objVeiculo){
        System.out.print("\n\n");
        System.out.print("Digite o Modelo do seu veiculo: ");
        String modelo = input.nextLine(); objVeiculo.setModelo(modelo);

        System.out.print("Digite a marca do seu veículo: ");
        String marca = input.nextLine(); input.nextLine();
        objVeiculo.setMarca(marca);
        

        System.out.print("Digite o ano de fabricação do seu veículo: ");
        int anoFabricacao = input.nextInt(); objVeiculo.setAnoFabricacao(anoFabricacao);

        System.out.print("Digite a velocidade atual do veículo: ");
        double velocidadeAtual = input.nextDouble(); objVeiculo.setVelocidadeAtual(velocidadeAtual);
    }

    public static void exibirValores(Veiculo objVeiculo){
        System.out.print("\n\n");
        System.out.println("Classe Veiculo: ");
        System.out.println("----------------");
        System.out.println("Modelo: " + objVeiculo.getModelo());
        System.out.println("Marca: " + objVeiculo.getMarca());
        System.out.println("Ano de Fabricação: " + objVeiculo.getAnoFabricacao());
        objVeiculo.ligarCarro();
        objVeiculo.fazerCarroAndar();
        System.out.println("Velocidade Atual: " + objVeiculo.getVelocidadeAtual() + " km/h.");
        objVeiculo.pararCarro();
        objVeiculo.desligarCarro();
        System.out.println("----------------");
    }
}
