package Lista1.Questao_5;

public class Moto extends Veiculo {
    private int cilindradas;
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, int cilindradas, boolean temPartidaEletrica) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Partida elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
    }
}
