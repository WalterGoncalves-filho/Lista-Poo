package Lista4.Questao1;


public class Smartwatch extends Dispositivos {
    private boolean monitoramentoCardiaco;
    private boolean gpsIntegrado;

    public Smartwatch(){}
    public Smartwatch(String nome, String modelo, String marca, String paisOrigem, float preco, int cod,
            boolean monitoramentoCardiaco, boolean gpsIntegrado) {
        super(nome, modelo, marca, paisOrigem, preco, cod);
        this.monitoramentoCardiaco = monitoramentoCardiaco;
        this.gpsIntegrado = gpsIntegrado;
    }

    public boolean isMonitoramentoCardiaco() {
        return monitoramentoCardiaco;
    }

    public void setMonitoramentoCardiaco(boolean monitoramentoCardiaco) {
        this.monitoramentoCardiaco = monitoramentoCardiaco;
    }

    public boolean isGpsIntegrado() {
        return gpsIntegrado;
    }

    public void setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Dados Smartwatch:");
        System.out.println("-----------------------------------");
        System.out.println("Smartwatch: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Monitoramento Cardíaco: " + (monitoramentoCardiaco ? "Sim" : "Não"));
        System.out.println("GPS Integrado: " + (gpsIntegrado ? "Sim" : "Não"));
        System.out.println("-----------------------------------");
        System.out.println();
    }
}
