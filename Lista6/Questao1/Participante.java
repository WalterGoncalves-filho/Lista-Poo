package Lista6.Questao1;

public class Participante {
    private static int totalCriados = 0; 

    private String nome;
    private int idade;
    private String tipoIngresso;

    public Participante(String nome, int idade, String tipoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        totalCriados++; 
    }

    public static int getTotalCriados() {
        return totalCriados;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nIngresso: " + tipoIngresso;
    }
}

