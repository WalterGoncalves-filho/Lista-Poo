package Lista5.Questao8;

public class CarrinhoDeCompras {
    private Produto[] produtos;
    private int tamanho;

    public CarrinhoDeCompras(int capacidade) {
        produtos = new Produto[capacidade];
        tamanho = 0;
    }

    public boolean adicionarProduto(Produto produto) {
        if (tamanho < produtos.length) {
            produtos[tamanho++] = produto;
            return true;
        } else {
            System.out.println("Carrinho cheio!");
            return false;
        }
    }

    public boolean removerProduto(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < tamanho - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[--tamanho] = null;
                return true;
            }
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < tamanho; i++) {
            total += produtos[i].getPreco();
        }
        return total;
    }

    public void listarProdutos() {
        if (tamanho == 0) {
            System.out.println("\n\n >> Carrinho vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("- " + produtos[i]);
                System.out.println("---------\n");
            }
        }
    }
}
