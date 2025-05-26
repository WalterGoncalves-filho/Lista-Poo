package Lista1.Questao_4;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    static Scanner input = new Scanner(System.in);

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa(){
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    public void setarValores(){
        System.out.print("Digite seu nome: ");
        this.nome = input.nextLine();input.nextLine();
        
        System.out.print("Digite sua idade: ");
        this.idade = input.nextInt();

        System.out.println("Digite seu cpf: ");
        this.cpf = input.nextLine();input.nextLine();
    }
}  
