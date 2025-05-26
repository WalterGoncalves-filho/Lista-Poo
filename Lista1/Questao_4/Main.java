package Lista1.Questao_4;
import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);
    static Aluno objAluno = new Aluno();
    static Professor objProfessor = new Professor();


    public static void main(String args[]){
        setarValores();
    }

    public static void setarValores(){
        System.out.print("\n\n");
        int op = 1;
        do{
            System.out.println("1- Professor");
            System.out.println("2- Aluno");
            System.out.println("3- Exibir");
            System.out.println("0- SAIR\n");
            op = input.nextInt();

            switch (op) {
                case 1: objProfessor.setarValores();
                    break;
                case 2: objAluno.setarValores(); 
                    break;
                case 3: exibirDados();
                    break;
                case 0: System.out.println("Saido....");
                    break;
                default: System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(op!=0);
    }

    public static void exibirDados(){
        System.out.println("\n\n");
        System.out.println("Dados Aluno:  ");
        System.out.println("----------------------------------------------");
        objAluno.exibirDados();
        System.out.println("----------------------------------------------");
        System.out.println("Dados Professor:  ");
        System.out.println("----------------------------------------------");
        objProfessor.exibirDados();
        System.out.println("----------------------------------------------");
    }
    
}
