
package Lista4.Questao1;

public class Smartphone extends Dispositivos{

    private int armazenamento; 
    private boolean tem5G;

    public Smartphone(String nome, String modelo, String marca, String paisOrigem, float preco, int cod) {
        super(nome, modelo, marca, paisOrigem, preco, cod);
    }

    public Smartphone(){}

    public int getArmazenamento() { return armazenamento;}
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento;}
    public boolean isTem5G() { return tem5G; }
    public void setTem5G(boolean tem5g) { tem5G = tem5g; }

    @Override
    public void exibirInfo(){
        System.out.println("\n\nInformações Smartphones:  ");
        System.out.println("-------------------------------");
        System.out.println("Smartphone: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Armazenamento: " + armazenamento + "GB.");
        System.out.println("5G: " + (tem5G ? "Sim" : "Não"));
        System.out.println("-------------------------------");
        System.out.println();
    }

}


