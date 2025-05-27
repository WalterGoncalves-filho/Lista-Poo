package Lista3.Questao_4;

public class Main {
    public static void main(String args[]){
        Produto p1 = new Produto("Notebook", 3500.0, 10);
        Produto p2 = new Produto("Mouse", 50.0, 30);

        Cliente cliente = new Cliente("Joao Silva", "joao@email.com", "Rua 1, N 100");

        Pedido pedido = cliente.fazerPedido();
        pedido.adicionarProduto(p1, 1);
        pedido.adicionarProduto(p2, 2);
        
        pedido.calcularTotal();
        cliente.exibirDados();
        pedido.exibirPedido();
    }
}
