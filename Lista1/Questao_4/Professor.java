package Lista1.Questao_4;

public class Professor extends Pessoa {
    private String departamento;
    private double salario;

    public Professor(String nome, int idade, String cpf) {
        super(nome, cpf,  idade);
    }

    public Professor(){}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: R$" + departamento);
    }

    @Override
    public void setarValores(){
        super.setarValores();
        
        System.out.print("Digite seu departamento: "); 
        this.departamento = input.nextLine();input.nextLine();

        System.out.print("Digite seu salário: ");
        this.salario = input.nextDouble();
    }
}

