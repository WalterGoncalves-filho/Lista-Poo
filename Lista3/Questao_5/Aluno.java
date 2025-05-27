package Lista3.Questao_5;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String endereco, String matricula, String curso){ 
        super(nome, cpf, endereco); 
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDados(){
        System.out.println("Dados do Aluno:");
        System.out.println("\n---------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
        System.out.println("---------------------\n");
    }
}
