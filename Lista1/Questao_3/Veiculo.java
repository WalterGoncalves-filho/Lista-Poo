package Lista1.Questao_3;

public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double velocidadeAtual;

    public Veiculo(){
    }

    public Veiculo(String modelo, String marca, int anoFabricacao, double velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void ligarCarro(){
        System.out.println("Ligando carro...");
    }

    
    public void fazerCarroAndar(){
        System.out.println("Carro andando...");
    }
    
    public void pararCarro(){
        System.out.println("Parando carro...");
    }

    public void desligarCarro(){
        System.out.println("Desligando carro...");
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }
    public double getVelocidadeAtual() { return velocidadeAtual; }
    public void setVelocidadeAtual(double velocidadeAtual) { this.velocidadeAtual = velocidadeAtual; }
}
