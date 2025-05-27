package Lista3.Questao_5;

public class Professor extends Pessoa{
    private float salario;
    private String disciplina;
    private String area_atuacao;

    public Professor(String nome, String cpf, String endereco, String disciplina, String area_atuacao, float salario){ 
        super(nome, cpf, endereco);
        this.salario = salario;
        this.disciplina = disciplina;
        this.area_atuacao = area_atuacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Dados do professor:");
        System.out.println("\n---------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: " + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Area atuacao: " + area_atuacao);
        System.out.println("---------------------\n");
    }
}
