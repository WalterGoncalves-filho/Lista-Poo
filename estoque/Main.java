package estoque;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList <Produto> produtosList = new ArrayList <Produto>();

    public static void main(String[]  args){

        int opc = 1;
        while (opc != 0) {
            System.out.println("\n\nBem Vindo ao sistema de Estoque!!\n\n");
            System.out.println("Seu Menu:");

            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Remover um Produto");
            System.out.println("3- Adicionar estoque de um Produto");
            System.out.println("4- Mostrar a quantidade do Estoque de um produto");
            System.out.println("5- Remover um estoque do Produto ");
            System.out.println("6- Listar Produtos ");
            System.out.print("0- Sair\n >>  ");
            opc = input.nextInt();
            
            switch (opc) {
                case 1:  limparConsole();addProduto();break;
                case 2: limparConsole();removeProduto();break;
                case 3: limparConsole();addEstoqueExits();break;
                case 4: limparConsole();qtdEstoque(); break;
                case 5: limparConsole();removeEstoque(); break;
                case 6: limparConsole();listProduto(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opcao invalida, tente novamente!");limparConsole();
                break;
            }
        }
          
    }


    public static void addProduto(){

        System.out.print("Quantos produtos vc ira cadastrar? ");
        int qtd = input.nextInt();
        input.nextLine();

        for (int i = 0;i<qtd;i++){
            Produto produto = new Produto();
            System.out.println("\n\nProduto " + (i+1) + ":");
            
            System.out.print("Digite o nome do produto: ");
            String nome = input.nextLine();
            produto.setNome(nome);

            System.out.print("Digite o preco do produto: ");
            float preco = input.nextFloat();
            produto.setPreco(preco);
            produto.addEstoque();
            produtosList.add(produto);
            input.nextLine();
        }
    }

    public static void removeProduto(){
        input.nextLine();
        System.out.print("Informe o nome do produto que deseja remover: ");
        String nome = input.nextLine();

        for(Produto i : produtosList){
            if (i.getNome().equals(nome)){
                produtosList.remove(i);
                System.out.println("Produto removido com sucesso!");
            }
        }
    }

    public static void addEstoqueExits(){
        input.nextLine();
        System.out.println("Digite o nome do produto que deseja adicionar o estoque: ");
        String nome = input.nextLine();
        for(Produto i : produtosList){
            if (i.getNome().equals(nome)){
                i.addEstoque();
                System.out.println("Estoque adicionado com sucesso!");
            }
        }
    }

    public static void qtdEstoque(){
        input.nextLine();
        System.out.print("Informe o nome do produto: ");
        String nome = input.nextLine();

        for(Produto i : produtosList){
            if (i.getNome().equals(nome)){
                System.out.println("A quantidade do produto '"+ nome + "' é de: "+i.getQtd_estoque()+" unidades.");
            }
        }
    }
    
    public static void removeEstoque(){
        input.nextLine();
        System.out.print("Digite o nome do produto que deseja remover: ");
        String nome = input.nextLine();

        for (Produto i : produtosList){
            if(i.getNome().equals(nome)){
                System.out.print("Informe a quantidade de estoque a ser removido: ");
                int qtd = input.nextInt();
                i.removeEstoque(qtd);
                System.out.println("Estoque produto removido com sucesso!");
            }
        }
    }

    public static void listProduto(){
        for(Produto prdt : produtosList){
            System.out.println(prdt);
        }
    }

    public static void limparConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao limpar console: " + e.getMessage());
        }
    }

}
