package Lista5.Questao3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Produto p1 = new Produto("Camiseta", 59.90);
        Produto p2 = new Produto("Tênis", 199.90);
        Produto p3 = new Produto("Boné", 39.90);

        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);
        pedido.adicionarProduto(p3);

        System.out.println();
        pedido.exibirProdutos();
        System.out.printf("Total da compra: R$ %.2f%n", pedido.calcularTotal());
    }
}
