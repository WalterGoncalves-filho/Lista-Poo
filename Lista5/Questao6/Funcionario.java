package Lista5.Questao6;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;

    public Funcionario(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome;}
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public float getSalario() {return salario; }
    public void setSalario(float salario) { this.salario = salario; }

    public void Funcionarios(){
        System.out.println("\nFUNCIONARIOS: ");
        System.out.println("Funcionario: "+ getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("cargo: " + getCargo());
        System.out.println("\n------------");
    }

    public void reajustarSalario(float percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
        }
    }

}
