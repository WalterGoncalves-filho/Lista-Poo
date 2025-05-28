package Lista5.Questao2;

import java.util.Scanner;


public class Produto {
    private String nome;
    private float preco;
    private int qtd_estoque;

    static Scanner input = new Scanner(System.in);

    public Produto(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
 
    public int getQtd_estoque() {
        return qtd_estoque;
    }


    public void addEstoque(){
        this.qtd_estoque++;
    }


    public void removeEstoque(int quantidade){
        if (quantidade > this.qtd_estoque){
            System.out.println("Quantidade invalida!");
        }else{
            this.qtd_estoque -= quantidade;
        }
    }

    // public void exibirProduto() {
    //     System.out.println("Nome: " + nome);
    //     System.out.println("Preço: R$" + preco);
    //     System.out.println("Quantidade em estoque: " + qtd_estoque);
    // }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\nPreço: R$ " + preco + "\nEstoque: " + qtd_estoque;
    }

    
}
