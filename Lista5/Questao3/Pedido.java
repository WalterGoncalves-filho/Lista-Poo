package Lista5.Questao3;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produtos;

    public Pedido() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirProdutos() {
        System.out.println("Produtos no pedido:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
        }
    }
}
