
package Lista4.Questao1;

public class Smartphons extends Dispositivos{

    private int armazenamento; 
    private boolean tem5G;

    public Smartphons(String nome, String modelo, String marca, String paisOrigem, float preco, int cod,
            int armazenamento, boolean tem5g) {
        super(nome, modelo, marca, paisOrigem, preco, cod);
        this.armazenamento = armazenamento;
        tem5G = tem5g;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Informações Smartphones:  ");
        System.out.println("-------------------------------");
        System.out.println("Smartphone: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Armazenamento: " + armazenamento + "GB.");
        System.out.println("5G: " + (tem5G ? "Sim" : "Não"));
        System.out.println("-------------------------------");
        System.out.println();
    }

    public int getArmazenamento() { return armazenamento;}
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento;}
    public boolean isTem5G() { return tem5G; }
    public void setTem5G(boolean tem5g) { tem5G = tem5g; }
}
