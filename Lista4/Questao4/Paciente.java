package Lista4.Questao4;

public abstract class Paciente {
    private String nome;
    private String cpf;
    private int idade;

    public Paciente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    // Método abstrato para agendar consulta, com possíveis regras e benefícios diferentes
    public abstract void agendarConsulta();

    // Método para exibir informações básicas
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}

