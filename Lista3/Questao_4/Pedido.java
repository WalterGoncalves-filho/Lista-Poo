package Lista3.Questao_4;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private Cliente cliente;
    private Produto produto;
    private List<ItemPedido> itens;
    private float valor_total;


    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valor_total = 0;
    }
    

    public Cliente getCliente() {
        return cliente;
    }


    public Produto getProduto() {
        return produto;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }    

    public void calcularTotal(){
        valor_total = 0;
        for (ItemPedido item : itens) {
            valor_total += item.getProduto().getPreco() * item.getQuantidade();
        }
    }

    public void exibirPedido(){
        System.out.println("\n\nPedidos: ");
        System.out.println("----------------------------------");
        System.out.println("Pedido de: " + cliente.getNome());
        for (ItemPedido item : itens) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome() + " - R$" +
                    item.getProduto().getPreco());
        }
        System.out.println("Total: R$" + valor_total);
        System.out.println("\n\n----------------------------------");
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.comprar(quantidade)) {
            itens.add(new ItemPedido(produto, quantidade));
        }
    } 
    
}