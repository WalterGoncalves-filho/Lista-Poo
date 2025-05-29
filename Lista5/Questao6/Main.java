package Lista5.Questao6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static Scanner leitura = new Scanner(System.in);

    public static void main(String args[]){
        int opcao;
        do {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Cadastrar Funcionários");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Reajustar Salário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(leitura.nextLine());

            switch (opcao) {
                case 1 : cadastrarFuncionarios(); break;
                case 2 : exibirFuncionarios(); break;
                case 3 : reajustarSalario(); break;
                case 0 : System.out.println("Saindo..."); break;
                default : System.out.println("Opção inválida!"); break;
            }
        } while (opcao != 0);
    }

    public static void cadastrarFuncionarios(){
        System.out.println("\n\n");
        System.out.println("============= Cadastro de funcionarios=============");
        System.out.print("\nQuantos Funcionarios serao cadastrados? ");
        int qtdfunc = Integer.parseInt(leitura.nextLine());

        for (int i = 0;i<qtdfunc;i++){
            System.out.println("\n----------------------");
            System.out.println("Funcionario " + (i+1) + " :");
            System.out.print("\nQual é o seu nome?  "); String nome = leitura.nextLine();
            System.out.print("Qual é o seu cargo?  "); String cargo = leitura.nextLine();
            System.out.print("Digite seu salario:  "); float salario = Float.parseFloat(leitura.nextLine());
            System.out.println("----------------------");
            funcionarios.add(new Funcionario(nome, cargo, salario));
        }
    }

    public static void exibirFuncionarios(){
        for(Funcionario obj : funcionarios){
            obj.Funcionarios();
        }
    }


    public static void reajustarSalario() {
        System.out.print("\nDigite o nome do funcionário para reajustar salário: ");
        String nomeBusca = leitura.nextLine();

        boolean encontrado = false;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.print("Informe o percentual de reajuste (%): ");
                float percentual = Float.parseFloat(leitura.nextLine());
                f.reajustarSalario(percentual);
                System.out.println("Salário reajustado com sucesso!");
                f.Funcionarios();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
