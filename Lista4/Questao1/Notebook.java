package Lista4.Questao1;

public class Notebook extends Dispositivos{

    private int ram;   private String processador;
  
    public Notebook(String nome, String modelo, String marca, String paisOrigem, float preco, int cod, int ram,
            String processador) {
        super(nome, modelo, marca, paisOrigem, preco, cod);
        this.ram = ram;
        this.processador = processador;
    }


    public int getRam() {return ram;}
    public void setRam(int ram) { this.ram = ram; }
    public String getProcessador() { return processador;}
    public void setProcessador(String processador) { this.processador = processador; }

    @Override
    public void exibirInfo(){
        System.out.println("Dados Aparelho Notebook:");
        System.out.println("----------------------");
        System.out.println("Notebook: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Memória RAM: " + ram + "GB");
        System.out.println("Processador: " + processador);
        System.out.println("----------------------");
        System.out.println();
    }
}
