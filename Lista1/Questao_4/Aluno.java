package Lista1.Questao_4;
import java.util.Scanner;

public class Aluno extends Pessoa{
    private String matricula;
    private String serie;
    private String turma;

    static Scanner input = new Scanner(System.in);

    public Aluno(){
    }

    public Aluno(String nome, String cpf, int idade){
        super(nome, cpf, idade);
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }
    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Serie: " + serie);
        System.out.println("Turma: " + turma);
    }

    @Override
    public void setarValores(){
        super.setarValores();
        
        System.out.print("Digite sua matricula: "); 
        this.matricula = input.nextLine();

        System.out.print("Digite código da sua turma: ");
        this.turma = input.nextLine();

        System.out.print("Digite o seu grau de escolaridade: ");
        this.serie = input.nextLine();
    }
}
