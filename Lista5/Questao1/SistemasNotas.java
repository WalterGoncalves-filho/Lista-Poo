package Lista5.Questao1;
import java.util.Scanner;

public class SistemasNotas{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 5);

        System.out.println();
        float nota;
        for (int i = 0;i<5;i++){
            System.out.print("Digite 5 notas: ");
            nota = scan.nextFloat();
            aluno.adicionarNota(nota);
        }

        System.out.println("\n-----");
        aluno.exibirNotas();
        System.out.print("Média de " + aluno.getNome() + ": " );
        System.out.printf("%.2f\n", aluno.calcularMedia());
    }
}

