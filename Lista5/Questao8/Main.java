package Lista5.Questao8;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(100); // capacidade máxima do carrinho

        int opcao;
        do {
            System.out.println("\n==== Menu da Loja ====");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Listar produtos");
            System.out.println("4. Calcular total");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção:  ");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1 : {
                    System.out.println("\n----------- Sistema de cadastro de produtos -----------");
                    System.out.print("Nome do produto: ");
                    String nome = entrada.nextLine();
                    System.out.print("Preço: ");
                    double preco = Double.parseDouble(entrada.nextLine());
                    Produto p = new Produto(nome, preco);
                    carrinho.adicionarProduto(p);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                }
                case 2 : 
                    System.out.println("\n----------- Sistema de remocao de produtos -----------");
                    System.out.print("Nome do produto a remover: ");
                    String nome = entrada.nextLine();
                    boolean removido = carrinho.removerProduto(nome);
                    System.out.println(removido ? "Removido com sucesso." : "Produto não encontrado.");
                    break;
                case 3 : carrinho.listarProdutos();  break;
                case 4 : System.out.printf("Total da compra: R$%.2f%n", carrinho.calcularTotal());  break;
                case 0 : System.out.println("Encerrando...");  break;
                default : System.out.println("Opção inválida.");  break;
            }
        } while (opcao != 0);
    }
}
